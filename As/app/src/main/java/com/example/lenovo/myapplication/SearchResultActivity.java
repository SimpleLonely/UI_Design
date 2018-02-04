package com.example.lenovo.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class SearchResultActivity extends Activity {

    private List<Problem> mData = null;
    private Context mContext;
    private ProblemAdapter mAdapter = null;
    private ListView problem_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        //
        mContext = SearchResultActivity.this;
        problem_list = (ListView) findViewById(R.id.problems_list);
        mData = new LinkedList<Problem>();
        mData.add(new Problem("No.1", R.mipmap.arrow_right));
        mData.add(new Problem("No.2", R.mipmap.arrow_right));
        mAdapter = new ProblemAdapter((LinkedList<Problem>) mData, mContext);
        problem_list.setAdapter(mAdapter);
    }

}
