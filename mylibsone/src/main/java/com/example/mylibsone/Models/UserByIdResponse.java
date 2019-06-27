package com.example.mylibsone.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserByIdResponse {

    @SerializedName("data")
    @Expose
    public Data data;


    private class Data {

        @SerializedName("id")
        @Expose
        public Integer id;
        @SerializedName("email")
        @Expose
        public String email;
        @SerializedName("first_name")
        @Expose
        public String firstName;
        @SerializedName("last_name")
        @Expose
        public String lastName;
        @SerializedName("avatar")
        @Expose
        public String avatar;
    }
}

 