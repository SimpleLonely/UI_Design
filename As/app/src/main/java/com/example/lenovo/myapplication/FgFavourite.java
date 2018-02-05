package com.example.lenovo.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lenovo on 2018/2/5.
 */

public class FgFavourite extends Fragment {
    private List<Problem> mData = null;
    private Context mContext;
    private ProblemAdapter mAdapter = null;
    private ListView problem_list;
    public FgFavourite() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_favourite, container, false);

        return view;
    }
}
