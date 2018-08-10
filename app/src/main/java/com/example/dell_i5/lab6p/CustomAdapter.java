package com.example.dell_i5.lab6p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell-i5 on 17/04/2018.
 */

public class CustomAdapter extends ArrayAdapter<DataModel> {

    public static LayoutInflater layoutInflater = null;


    public class ViewHolder {

        TextView txtUserName;
        TextView txtUserMsg;
        TextView txtTime;
    }

    public CustomAdapter(Context context, int resource, ArrayList<DataModel> list) {
        super(context, resource, list);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        DataModel data = getItem(position);
        View rowView;
        rowView = layoutInflater.inflate(R.layout.custom_row_layout, null);

        viewHolder.txtUserName = (TextView) rowView.findViewById(R.id.textUserName);
        viewHolder.txtUserMsg = (TextView) rowView.findViewById(R.id.textMessage);
        viewHolder.txtTime = (TextView) rowView.findViewById(R.id.textTime);
        viewHolder.txtUserName.setText(data.getUserName());
        viewHolder.txtUserMsg.setText(data.getUserMsg());
        viewHolder.txtTime.setText(data.getUserTime());

        return rowView;

    }
}
