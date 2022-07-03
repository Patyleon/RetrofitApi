package com.example.retrofit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.retrofit.Client.RetrofitClient;
import com.example.retrofit.Clients.RetrofitApiClients;
import com.example.retrofit.Service.RetrofitApiService;
import com.example.retrofit.Services.RetrofitApiServices;
import com.example.retrofit.databinding.ActivityMainBinding;
import com.example.retrofit.entity.Message;
import com.example.retrofit.entitys.Messages;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private Button mButtons;
    private ActivityMainBinding binding;
    private RetrofitApiService apiService;
    private RetrofitApiServices apiServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initValues();
        initVal();
        initViews();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getMessage("12cfb892-aac0-4c5b-94af-521852e46d6a");
            }
        });

        mButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMessages(430);
            }
        });
    }
    private void initView(){
        mTextView=findViewById(R.id.TextView);
        mButton=findViewById(R.id.button);
    }
    private void initViews(){
        mTextView=findViewById(R.id.TextView);
        mButtons=findViewById(R.id.button2);
    }

    private void initValues(){
        apiService = RetrofitClient.getApiService();
    }
    private void initVal(){
        apiServices = RetrofitApiClients.getApiService();
    }
    private void getMessage (String id){
        apiService.getMessageId(id).enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
               Message message = response.body();
                mTextView.setText(message.toString());
            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }

    private void getMessages(int code){
        apiServices.getMessagesId(code).enqueue(new Callback<Messages>() {
            @Override
            public void onResponse(Call<Messages> call, Response<Messages> response) {
                Messages messages = response.body();
                mTextView.setText(messages.toString());
            }

            @Override
            public void onFailure(Call<Messages> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }
}