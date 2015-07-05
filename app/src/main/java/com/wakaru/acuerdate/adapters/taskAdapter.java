package com.wakaru.acuerdate.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wakaru.acuerdate.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maxxi_000 on 05-07-2015.
 */
public class taskAdapter extends BaseAdapter {


    ArrayList<SingleRow> list;
    Context context;

    taskAdapter(Context c, List<String> subject, List<String> time, List<String> date){
        list = new ArrayList<SingleRow>();

        for (int i = 0; i < subject.size(); i++){
            list.add(new SingleRow(subject.get(i), date.get(i), time.get(i)));
        }

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.row_task, parent, false);

        TextView dateRow = (TextView) row.findViewById(R.id.dateRow);
        TextView timeRow = (TextView) row.findViewById(R.id.timeRow);
        TextView subjectRow = (TextView) row.findViewById(R.id.subjectRow);

        SingleRow temp = list.get(position);

        dateRow.setText(temp.date);
        timeRow.setText(temp.time);
        subjectRow.setText(temp.subject);

        return row;
    }
}

class SingleRow{
    String subject;
    String date;
    String time;

    SingleRow(String subject, String date, String time){

        this.subject = subject;
        this.time = time;
        this.date = date;
    }

}

