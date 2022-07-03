package com.example.retrofit.Clients;

import com.example.retrofit.Services.RetrofitApiServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApiClients {
    public static final String URL_BASE ="https://brasilapi.com.br/";
    private static Retrofit retrofit;

    public static RetrofitApiServices getApiService(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(RetrofitApiServices.class);

    }
}
