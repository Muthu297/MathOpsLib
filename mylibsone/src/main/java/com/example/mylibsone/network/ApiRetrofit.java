package com.example.mylibsone.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiRetrofit {


    private static final String baseUrl = "https://reqres.in";

    public static Retrofit getClient() {

        Retrofit retrofitClient = null;
        try {
            retrofitClient = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return retrofitClient;
    }


}
