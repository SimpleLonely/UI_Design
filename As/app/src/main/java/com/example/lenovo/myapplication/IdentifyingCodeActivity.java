package com.example.lenovo.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/2/5.
 */

public class IdentifyingCodeActivity extends AppCompatActivity{
    private LinearLayout backToInputEmail;
    private TextView emailAddress;
    private TextView openEmail;
    private TextView countDown;
    private TextView resendCode;
    private EditText identifyingCode;
    private Button identify;
    private CheckBox emailForAccount;

    String address;     //邮箱地址
    String code;        //验证码
    boolean isChecked;   //复选框是否被选中
    boolean isIdentifyClickable;    //验证按钮是否可点击

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifying_code);

        //初始化控件
        initWidget();

        //响应事件
        backToInputEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IdentifyingCodeActivity.this,RegisterActivity.class));
                finish();
            }
        });

        //打开外部浏览器访问邮箱
        openEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        identify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isIdentifyClickable){
                    if (identifyingCode.getText().toString().equals(code)){
                        startActivity(new Intent(IdentifyingCodeActivity.this,OtherInfoActivity.class).putExtra("email",address));
                        Toast.makeText(IdentifyingCodeActivity.this,"验证成功！",Toast.LENGTH_LONG).show();
                        finish();
                    }else {
                        identifyingCode.setText("");
                        Toast.makeText(IdentifyingCodeActivity.this,"验证码错误，请重新输入！",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        identifyingCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                isIdentifyClickable = isChecked && identifyingCode.getText().toString().length() == 6;
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void initWidget() {
        backToInputEmail = findViewById(R.id.back_to_input_email);
        emailAddress = findViewById(R.id.email_address_textview);
        openEmail = findViewById(R.id.open_email_textview);
        countDown = findViewById(R.id.count_down_textview);
        resendCode = findViewById(R.id.resend_code_textview);
        identifyingCode = findViewById(R.id.identifying_code_editText);
        identify = findViewById(R.id.identify_button);
        emailForAccount = findViewById(R.id.emial_for_account_checkbox);

        isChecked = true;   //      默认为选中状态
        address = getIntent().getStringExtra("email");
        code = getIntent().getStringExtra("identifyingCode");

        //显示邮箱地址
        SpannableStringBuilder span = new SpannableStringBuilder("我们已经给邮箱"+address+"发送了一个6位数验证码");
        span.setSpan(new ForegroundColorSpan(Color.rgb(255,163,0)),
                "我们已经给邮箱".length(),
                ("我们已经给邮箱"+address).length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        emailAddress.setText(span);
    }
}
