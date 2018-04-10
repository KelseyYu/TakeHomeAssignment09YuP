package com.example.mac.takehomeassignment09_yup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void customize(View view){
        Intent intent = new Intent(this, CoffeeActivity.class);
        startActivity(intent);
    }

}
