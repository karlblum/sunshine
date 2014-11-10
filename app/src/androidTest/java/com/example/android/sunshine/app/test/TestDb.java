package com.example.android.sunshine.app.test;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;

import com.example.android.sunshine.app.data.WeatherDbHelper;

/**
 * Created by Karl on 10.11.2014.
 */
public class TestDb extends AndroidTestCase {

    public static final String LOG_TAG = TestDb.class.getSimpleName();

    public void testCreateDb() throws Throwable {
        mContext.deleteDatabase(WeatherDbHelper.DATABASE_NAME);
        SQLiteDatabase db = new WeatherDbHelper(
                this.mContext).getWritableDatabase();
        assertEquals(true, db.isOpen());
        db.close();
    }

}
