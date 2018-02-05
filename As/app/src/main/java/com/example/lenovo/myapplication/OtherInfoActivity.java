package com.example.lenovo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2018/2/5.
 */

public class OtherInfoActivity extends AppCompatActivity{
    private LinearLayout backToEmailInput;
    private EditText phoneNum;
    private EditText password;
    private EditText passwordConfirm;
    private Button register;
    private CheckBox showPassword;

    String emailAddress;    //邮箱地址

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_infomation);

        //初始化控件
        initWidget();

        //响应事件
        showPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //设置EditText的密码为可见的
                    password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    passwordConfirm.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    //设置密码为隐藏的
                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    passwordConfirm.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
                //防止光标移到前面
                password.setSelection(password.getText().length());
                passwordConfirm.setSelection(passwordConfirm.getText().length());
            }
        });

        backToEmailInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherInfoActivity.this,RegisterActivity.class));
                finish();
            }
        });
    }

    //初始化控件
    private void initWidget() {
        backToEmailInput = findViewById(R.id.back_to_email_input);
        phoneNum = findViewById(R.id.phone_number_edittext);
        password = findViewById(R.id.password_edittext);
        passwordConfirm = findViewById(R.id.password_confirm_edittext);
        register = findViewById(R.id.register_button);
        showPassword = findViewById(R.id.show_password_checkbox);

        emailAddress = getIntent().getStringExtra("email");     //获取邮箱地址
    }
}
