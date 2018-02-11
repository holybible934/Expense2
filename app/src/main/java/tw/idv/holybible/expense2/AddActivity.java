package tw.idv.holybible.expense2;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {


    private final String TAG = AddActivity.class.getSimpleName();
    private EditText expName;
    private EditText edAmount;
    private EditText expDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        findViews();
    }

    private void findViews() {
        expName = findViewById(R.id.edtxtExpName);
        edAmount = findViewById(R.id.edtxtAmount);
        expDate = findViewById(R.id.edtxtDate);
    }

    public void add(View view) {
        String name = expName.getText().toString();
        String date = expDate.getText().toString();
        int amount = Integer.parseInt(edAmount.getText().toString());
        Log.d(TAG, "add: " + amount);
        ExpenseHelper helper = new ExpenseHelper(this);
        ContentValues values = new ContentValues();
        values.put("info", name);
        values.put("cdate", date);
        values.put("amount", amount);
        long cursorId = helper.getWritableDatabase()
                .insert(ExpenseContract.EXPENSE_TABLE, null, values);
        if (cursorId == -1) {
            new AlertDialog.Builder(this)
                    .setTitle("Database Error!")
                    .setMessage("Insert Failed")
                    .setPositiveButton("OK", null)
                    .show();
        }
        else {
            Log.d(TAG, "add: Insert succeeded!");
            helper.close();
            finish();
        }
    }
}
