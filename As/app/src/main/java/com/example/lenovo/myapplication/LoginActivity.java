package com.example.lenovo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/2/4.
 */

public class LoginActivity extends AppCompatActivity{
    private TextView skipLogin;
    private TextView forgetPassword;
    private TextView register;
    private TextView userAgreement;
    private EditText account;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //初始化控件
        initWidget();

        //点击事件
        skipLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                finish();   //销毁当前Activity
                startActivity(intent);
            }
        });
    }

    //初始化控件
    private void initWidget() {
        skipLogin = findViewById(R.id.skip_login_button);
        forgetPassword = findViewById(R.id.forget_password_textview);
        register = findViewById(R.id.register_textview);
        userAgreement = findViewById(R.id.user_agreement_textview);
        account = findViewById(R.id.account_edittext);
        password = findViewById(R.id.password_edittext);
        login = findViewById(R.id.login_button);
    }
}
