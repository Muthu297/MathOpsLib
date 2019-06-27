package com.example.mylibsone.network;

import com.example.mylibsone.Models.UserByIdResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("/api/users/{id}")
    Call<UserByIdResponse> getUserById(@Path("id") int id);


}
