package com.example.lenovo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PersonActivity extends Activity implements AdapterView.OnItemClickListener{
    private String[] names = new String[]{"消息", "设置", "反馈","合作","评分"};
    private int[] imgIds = new int[]{R.mipmap.messages, R.mipmap.setting, R.mipmap.feedback,R.mipmap.cooperate,R.mipmap.evaluate};
    private List<Map<String, Object>> data;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        data=new ArrayList<Map<String, Object>>();
        SimpleAdapter myAdapter = new SimpleAdapter(this,getdata(), R.layout.person_list_item, new String[]{"imgs", "name"}, new int[]{R.id.imgtou, R.id.name

        });
        listView = (ListView) findViewById(R.id.person_list);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(this);
    }
    private List<Map<String, Object>> getdata(){
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showitem = new HashMap<String, Object>();
            showitem.put("imgs", imgIds[i]);
            showitem.put("name", names[i]);
            data.add(showitem);
        }
        return data;
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        switch (position){
            case 0:{
                Intent i=new Intent(PersonActivity.this,MainActivity.class);
                startActivity(i);
                break;
            }                                                   //消息
            case 1:{
                Intent i=new Intent(PersonActivity.this,MainActivity.class);
                startActivity(i);
                break;
            }                                                   //设置
            case 2:{
                Intent i=new Intent(PersonActivity.this,FeedbackActivity.class);
                startActivity(i);
                break;
            }                                                   //反馈
            case 3:{
                Intent i=new Intent(PersonActivity.this,MainActivity.class);
                startActivity(i);
                break;
            }                                                   //合作
            case 4:{
                Intent i=new Intent(PersonActivity.this,MainActivity.class);
                startActivity(i);
                break;
            }                                                   //评分
        };
        return;
    }
};


