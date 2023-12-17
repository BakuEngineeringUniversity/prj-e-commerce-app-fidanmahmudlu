package com.example.myapplicationn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplicationn.retrofit.ApiUtils;
import com.example.myapplicationn.retrofit.RetrofitDao;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SingnInActivity extends AppCompatActivity {
    private Button signInButton1;
    private EditText userName,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        signInButton1 = findViewById(R.id.signInButton1);
        userName = findViewById(R.id.username);
        password = findViewById(R.id.password);
        RetrofitDao retrofitDao = ApiUtils.getDao();
        signInButton1.setOnClickListener(view->{
            if (TextUtils.isEmpty(userName.getText()) || TextUtils.isEmpty(password.getText())){
                Toast.makeText(getApplicationContext(), "Butun Alalanlarin dolu oldugndan emin olunuz!", Toast.LENGTH_LONG).show();
            }else {
                User user = new User(userName.getText().toString(), password.getText().toString());
                retrofitDao.login(user).enqueue(new Callback<ArrayList<LoginResponse>>() {
                    @Override
                    public void onResponse(Call<ArrayList<LoginResponse>> call, Response<ArrayList<LoginResponse>> response) {
                        Log.e("RETROFIT", "Success");
                    }

                    @Override
                    public void onFailure(Call<ArrayList<LoginResponse>> call, Throwable t) {
                        Log.e("RETROFIT", t.getMessage());
                    }
                });
            }
        });

    }
    public void openActivity4 () {
        Intent intent = new Intent(this, MainActivity0.class);
        startActivity(intent);
    }
}