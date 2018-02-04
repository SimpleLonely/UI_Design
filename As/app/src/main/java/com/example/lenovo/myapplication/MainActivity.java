package com.example.lenovo.myapplication;

        import android.os.Bundle;
        import android.support.annotation.NonNull;
        import android.support.design.widget.BottomNavigationView;
        import android.support.v7.app.AppCompatActivity;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.TextView;
        import android.content.Intent;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button camera_button=(Button)this.findViewById(R.id.camera_button);
        camera_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,CameraActivity.class);
                startActivity(i);
            }
        });

        Button person_button=(Button)this.findViewById(R.id.person);
        person_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,PersonActivity.class);
                startActivity(i);
            }
        });

        Button word_search_button=(Button)this.findViewById(R.id.word_search);
        word_search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,WordSearchActivity.class);
                startActivity(i);
            }
        });
    };


}
