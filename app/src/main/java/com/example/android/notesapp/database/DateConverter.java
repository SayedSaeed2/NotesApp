package com.example.android.notesapp.database;

import java.util.Date;

public class DateConverter {

    @android.arch.persistence.room.TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    @android.arch.persistence.room.TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }


}
