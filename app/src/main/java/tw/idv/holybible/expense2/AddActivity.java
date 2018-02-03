package tw.idv.holybible.expense2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

    public void add() {
        String name = expName.getText().toString();
        String date = expDate.getText().toString();
        int amount = Integer.parseInt(edAmount.getText().toString());
        Log.d(TAG, "add: " + amount);
    }
}
