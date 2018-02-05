package com.example.lenovo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2018/2/5.
 */

public class ForgetPasswordActivity extends AppCompatActivity{
    private LinearLayout backToLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        //初始化控件
        initWidget();

        //响应事件
        backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgetPasswordActivity.this,LoginActivity.class));
                finish();
            }
        });
    }

    //初始化控件
    private void initWidget() {
        backToLogin = findViewById(R.id.back_to_log_in);
    }
}
