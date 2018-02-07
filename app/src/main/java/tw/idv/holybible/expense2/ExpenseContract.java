package tw.idv.holybible.expense2;

/**
 * Created by chchang on 2018/2/7.
 */

public class ExpenseContract {
    public static final String DB_NAME = "expense.db";
    public static final int DB_VERSION = 1;
    public static final String EXPENSE_TABLE = "exp";
    public static final String COL_ID = "_id";
    public static final String COL_DATE = "cdate";
    public static final String COL_AMOUNT = "amount";
    public static final String COL_INFO = "info";

    public static final String CREATE_EXPENSE_TABLE =
            "CREATE TABLE " + EXPENSE_TABLE + "( " +
                    COL_ID + " INTEGER PRIMARY KEY, " +
                    COL_INFO + " VARCHAR NOT NULL, " +
                    COL_DATE + " DATETIME NOT NULL, " +
                    COL_AMOUNT + " INTEGER NOT NULL )";
}
