package com.example.lenovo.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;
public class WordSearchActivity extends Activity implements AdapterView.OnItemClickListener{

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
        list_subject.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:{
                Intent i=new Intent(WordSearchActivity.this,MainActivity.class);
                startActivity(i);
                break;
            }                                                   //微积分
            case 1:{
                Intent i=new Intent(WordSearchActivity.this,MainActivity.class);
                startActivity(i);
                break;
            }                                                   //线性代数
        };
        return;
    }
}
