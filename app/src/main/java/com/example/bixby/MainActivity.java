package com.example.bixby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton startBtn=(ImageButton) findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),Home.class);
                startIntent.putExtra("com.example.bixby.SOMETHING","Hello");
                startActivity(startIntent);


            }
        });

    }
}
