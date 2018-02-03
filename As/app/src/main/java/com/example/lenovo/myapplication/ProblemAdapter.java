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
 * Created by lenovo on 2018/2/3.
 */

public class ProblemAdapter extends BaseAdapter {
    private LinkedList<Problem> mData;
    private Context mContext;

    public ProblemAdapter(LinkedList<Problem> mData, Context mContext) {
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
        convertView = LayoutInflater.from(mContext).inflate(R.layout.problems_list_item,parent,false);
        ImageView img_icon = (ImageView) convertView.findViewById(R.id.arrow);
        TextView txt_aName = (TextView) convertView.findViewById(R.id.problem);
        img_icon.setBackgroundResource(mData.get(position).getaIcon());
        txt_aName.setText(mData.get(position).getaName());
        return convertView;
    }
}
