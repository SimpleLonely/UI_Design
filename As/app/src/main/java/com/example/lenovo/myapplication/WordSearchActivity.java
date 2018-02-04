package com.example.lenovo.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class WordSearchActivity extends Activity {

    private List<Subject> mData = null;
    private Context mContext;
    private SubjectAdapter mAdapter = null;
    private ListView list_subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_search);

        mContext = WordSearchActivity.this;
        list_subject = (ListView) findViewById(R.id.subject_list);
        mData = new LinkedList<Subject>();
        mData.add(new Subject("微积分", R.mipmap.calculus));
        mData.add(new Subject("线性代数",  R.mipmap.linear_algebra));
        mAdapter = new SubjectAdapter((LinkedList<Subject>) mData, mContext);
        list_subject.setAdapter(mAdapter);
    }

}
