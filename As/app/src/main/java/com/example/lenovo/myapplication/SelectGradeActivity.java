package com.example.lenovo.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class SelectGradeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private boolean one_selected = false;
    private boolean two_selected = false;
    private Spinner spin_one;
    private Spinner spin_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_grade);
        bindViews();
    }
    private void bindViews() {
        spin_one = (Spinner) findViewById(R.id.spinner);
        spin_two = (Spinner) findViewById(R.id.spinner);
        spin_one.setOnItemSelectedListener(this);
        spin_two.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.spinner:
                if(one_selected){
                    //
                }
                else one_selected = true;
                break;
            case R.id.spinner2:
                if(two_selected){
                    //
                }
                else two_selected = true;
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
