package com.example.mylibsone;


import com.example.mylibsone.Models.UserByIdResponse;
import com.example.mylibsone.network.ApiInterface;
import com.example.mylibsone.network.ApiRetrofit;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiController {


    private static ApiInterface apiInterface;


    private static void init() {

        if (apiInterface == null) {
            apiInterface = ApiRetrofit.getClient().create(ApiInterface.class);
        }
    }

    public static void callUserByIdApi() {

        init();

        Call<UserByIdResponse> userByIdResponseCall = apiInterface.getUserById(2);


        userByIdResponseCall.enqueue(new Callback<UserByIdResponse>() {
            @Override
            public void onResponse(Call<UserByIdResponse> call, Response<UserByIdResponse> response) {


                TimberX.debug("Response Received");

                String responseJsonStr = new GsonBuilder().create().toJson(response.body());
                TimberX.debug(responseJsonStr);
            }

            @Override
            public void onFailure(Call<UserByIdResponse> call, Throwable t) {
                TimberX.debug("Failed to get response");
            }
        });


    }

}
