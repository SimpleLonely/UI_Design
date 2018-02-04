package com.example.lenovo.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by lenovo on 2018/2/4.
 */

public class SubjectAdapter extends BaseAdapter {
    private LinkedList<Subject> mData;
    private Context mContext;

    public SubjectAdapter(LinkedList<Subject> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.subject_list_item,parent,false);
        ImageView img_icon = (ImageView) convertView.findViewById(R.id.subject_icon);
        TextView txt_aName = (TextView) convertView.findViewById(R.id.subject_name);
        img_icon.setBackgroundResource(mData.get(position).getaIcon());
        txt_aName.setText(mData.get(position).getaName());
        return convertView;
    }
}
