package tw.idv.holybible.expense2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chchang on 2018/2/3.
 */

public class ExpenseHelper extends SQLiteOpenHelper {

    public ExpenseHelper(Context context){
        this(context, ExpenseContract.DB_NAME,
                null, ExpenseContract.DB_VERSION, null);
    }

    public ExpenseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ExpenseContract.CREATE_EXPENSE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
