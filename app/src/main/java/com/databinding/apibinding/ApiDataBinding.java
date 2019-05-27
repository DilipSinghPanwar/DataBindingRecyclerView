package com.databinding.apibinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.databinding.R;
import com.databinding.beans.Todos;
import com.databinding.databinding.ActivityApidatabindingBinding;
import com.databinding.databinding.ActivityMainBinding;
import com.databinding.retrofit.ApiClient;
import com.databinding.retrofit.ApiInterface;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ApiDataBinding extends AppCompatActivity {

    private static final String TAG = ApiDataBinding.class.getSimpleName();
    private ActivityApidatabindingBinding apidatabindingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        apidatabindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_apidatabinding);

//        httpRequest();
    }

/*    private void httpRequest() {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<JsonElement> call = apiService.getElement();
        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                Gson gson = new Gson();
                Todos todos = gson.fromJson(response.body(), Todos.class);
                apidatabindingBinding.setTodos(todos);
            *//*    Log.e(TAG, "onResponse: " + response.isSuccessful());
                Log.e(TAG, "onResponse: " + response.body());*//*
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                Log.e(TAG, "onFailure: >>" + t.toString());
            }
        });
    }*/
}