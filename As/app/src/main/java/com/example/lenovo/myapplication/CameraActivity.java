package com.example.lenovo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class CameraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        Button person_button=(Button)this.findViewById(R.id.shoot);
        person_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CameraActivity.this,CameraConfirmActivity.class);
                startActivity(i);
            }
        });
    }

}
