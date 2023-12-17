package com.example.myapplicationn;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button signInButton;
    private Button signUpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signInButton = (Button) findViewById(R.id.signInButton);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });

        signUpButton = (Button) findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();

            }
        });
    }
        public void openActivity2 () {
            Intent intent = new Intent(this, SingnInActivity.class);
            startActivity(intent);
    }

    public void openActivity3 () {
        Intent intent = new Intent(this, SingnUpActivity.class);
        startActivity(intent);
    }
}