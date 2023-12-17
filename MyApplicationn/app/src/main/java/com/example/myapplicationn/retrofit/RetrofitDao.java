package com.example.myapplicationn.retrofit;

import com.example.myapplicationn.LoginResponse;
import com.example.myapplicationn.User;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitDao {
    @POST("user")
    Call<ArrayList<LoginResponse>> login(@Body User user);
}
