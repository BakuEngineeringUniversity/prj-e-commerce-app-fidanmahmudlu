package com.example.myapplicationn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button signInButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        signInButton1= (Button) findViewById(R.id.signInButton1);
        signInButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();

            }
        });

    }
    public void openActivity4 () {
        Intent intent = new Intent(this, MainActivity0.class);
        startActivity(intent);
    }
}