package com.databinding.recyclerviewbinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.databinding.R;
import com.databinding.beans.Todos;
import com.databinding.beans.Users;
import com.databinding.databinding.ActivityRecyclerviewdatabindingsBinding;
import com.databinding.retrofit.ApiClient;
import com.databinding.retrofit.ApiInterface;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecyclerviewBinding extends AppCompatActivity {

    private static final String TAG = RecyclerviewBinding.class.getSimpleName();
    private ActivityRecyclerviewdatabindingsBinding apidatabindingBinding;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        apidatabindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_recyclerviewdatabindings);
        httpRequest();
        recyclerView = apidatabindingBinding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerviewBinding.this));
    }

    private void httpRequest() {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<JsonElement> call = apiService.getList();
        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                Log.e(TAG, "onResponse: >>" + response.isSuccessful());
                Gson gson = new Gson();
                Users users = gson.fromJson(response.body(), Users.class);
                RecyclerviewAdapter cabTrackBookingAdapter = new RecyclerviewAdapter(RecyclerviewBinding.this,users);
                recyclerView.setAdapter(cabTrackBookingAdapter);
                cabTrackBookingAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                Log.e(TAG, "onFailure: >>" + t.toString());
            }
        });
    }
}