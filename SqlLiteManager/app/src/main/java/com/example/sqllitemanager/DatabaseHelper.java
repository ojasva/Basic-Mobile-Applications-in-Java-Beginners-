package com.example.sqllitemanager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;
import androidx.annotation.Nullable;
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DataBasename="student-detail.db";
    public static final String tablename="student";
    public static final String col_1="Name";
    public static final String col_2="Id";
    public static final String col_3="Dept";
    public DatabaseHelper(@Nullable Context context) {
        super(context, DataBasename, null, 1);
    }

    @Override public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+tablename + "(Name TEXT, Id INTEGER primary key , Dept TEXT)");
    }

    @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ tablename);
    }
    public boolean insert(String id, String nam, String dept) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(col_1,nam);
        cv.put(col_2,Integer.parseInt(id));
        cv.put(col_3,dept);
        long result= db.insert(tablename,null,cv);
        db.close();
        if(result==-1) {
            return false;
        }
        else
            return true;


    }

    public Cursor getData() {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from "+ tablename,null);
        return cursor;
    }

    public void update(String id, String nam, String dept) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(col_1,nam);
        cv.put(col_2,Integer.parseInt(id));
        cv.put(col_3,dept);
        db.update(tablename, cv, "id=?", new String[]{id});
        db.close();
    }

    public void delete(String id) {
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(tablename,"id=?", new String[]{ id } );
        db.close();
    }
}
