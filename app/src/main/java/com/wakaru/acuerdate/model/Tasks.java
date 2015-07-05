package com.wakaru.acuerdate.model;

import android.provider.BaseColumns;

/**
 * Created by maxxi_000 on 03-07-2015.
 */
public class Tasks
{
    private long id;
    private String subject;
    private int date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

}
