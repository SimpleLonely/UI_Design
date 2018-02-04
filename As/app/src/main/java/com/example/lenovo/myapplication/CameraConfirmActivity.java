package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CameraConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_confirm);

        Button person_button=(Button)this.findViewById(R.id.confirm);
        person_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //展示搜索结果

                Intent i=new Intent(CameraConfirmActivity.this,SearchResultActivity.class);
                startActivity(i);
            }
        });

        Button back_button=(Button)this.findViewById(R.id.back);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CameraConfirmActivity.this.finish();
            }
        });
    }
}
