package com.example.lenovo.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Administrator on 2018/2/5.
 */

public class RegisterActivity extends AppCompatActivity{
    private LinearLayout backToLogin;
    private TextView userAgreement;
    private EditText emailAddress;
    private Button identifyingCode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //初始化控件
        initWidget();

        //点击事件
        backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                finish();
            }
        });


        identifyingCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this)
                        .setTitle("发送验证码")
                        .setMessage("请确认你的邮箱地址：\n"+emailAddress.getText().toString()+"\n如果填写无误，稍后你将收到一封验证码邮件");

                setNegativeButton(builder);
                setPositiveButton(builder);

                builder.create().show();
            }

            private void setNegativeButton(AlertDialog.Builder builder) {
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //To do something
                    }
                });
            }

            private void setPositiveButton(AlertDialog.Builder builder) {
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        int rawCode = new Random().nextInt(999999);     //生成验证码
                        String code = "111111";     //应改为String code = rawCode+"";
                        boolean isSendSuccess = sendIdentifyingCode(code);
                        if (isSendSuccess){
                            startActivity(new Intent(RegisterActivity.this,IdentifyingCodeActivity.class)
                                    .putExtra("email",emailAddress.getText().toString())
                                    .putExtra("identifyingCode",code));
                        }else {
                            Toast.makeText(RegisterActivity.this,"验证码发送失败，请重试！",Toast.LENGTH_LONG).show();
                        }

                    }
                });
            }
        });
    }

    //发送验证码到用户邮箱
    private boolean sendIdentifyingCode(String code) {
        //To do something
        return true;
    }

    private void initWidget() {
        backToLogin = findViewById(R.id.back_to_login);
        userAgreement = findViewById(R.id.user_agreement_textview);
        emailAddress = findViewById(R.id.email_edittext);
        identifyingCode = findViewById(R.id.identifiying_code_button);
    }
}
