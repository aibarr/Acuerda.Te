package com.wakaru.acuerdate.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

/**
 * Created by maxxi_000 on 03-07-2015.
 */
public class TasksDataSource {

    //metadatos de tabla
    public static final String TASKS_TABLE_NAME = "Tasks";
    public static final String STRING_TYPE = "text";
    public static final String INT_TYPE = "integer";
    public static final String DATE_TYPE = "integer";

    //Campos de la tabla TasksReader
    public static class ColumnTasks{
        public static final String ID_TASKS = BaseColumns._ID;
        public static final String DATE_TASKS = "Date";
        public static final String SUBJECT_TASKS = "subject";
    }

    //Script para crear tabla
    public static final String CREATE_TASKS_SCRIPT =
            "create table " + TASKS_TABLE_NAME + "(" +
                    ColumnTasks.ID_TASKS + " " + INT_TYPE + " primary key autoincrement, " +
                    ColumnTasks.SUBJECT_TASKS+" "+STRING_TYPE+" not null, " +
                    ColumnTasks.DATE_TASKS+" "+INT_TYPE+" not null)";


    public static final String INSERT_TASKS_SCRIPT =
            "insert into "+TASKS_TABLE_NAME+ " values("+
                    "null,"+ "Banhiar al perro, "+ "20150725" + ")," +
                    "(" + "null," + "Sacar la Basura, " + "20150726" + ")," +
                    "(" + "null," + "Meterselo al Waton, " + "20150727" + ")" ;

    private TasksReader openHelper;
    private SQLiteDatabase db;

    public TasksDataSource (Context context){
        openHelper = new TasksReader(context);
        db = openHelper.getWritableDatabase();

    }

}
