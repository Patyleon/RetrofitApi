package com.example.retrofit.Services;

import com.example.retrofit.entitys.Messages;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitApiServices {
    @GET("api/banks/v1/{code}")
    Call<Messages> getMessagesId(@Path("code")int id);
}
