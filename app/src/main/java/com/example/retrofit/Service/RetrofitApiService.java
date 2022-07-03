package com.example.retrofit.Service;

import com.example.retrofit.entity.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitApiService {
    @GET("films/{id}")
    Call<Message>getMessageId(@Path("id")String id);
}
