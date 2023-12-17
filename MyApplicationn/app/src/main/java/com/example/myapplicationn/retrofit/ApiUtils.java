package com.example.myapplicationn.retrofit;

public class ApiUtils {
    private static final String BASE_URL = "http://127.0.0.1:8080/api/";
    public static RetrofitDao getDao(){
        return  RetrofitClient.getClient(BASE_URL).create(RetrofitDao.class);
    }
}
