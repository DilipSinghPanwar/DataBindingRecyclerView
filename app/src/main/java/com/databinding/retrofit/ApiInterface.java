package com.databinding.retrofit;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    /*@POST("/telecoach/corconnapp/webservices/home/HomeServices/login")
    Call<JsonElement> getLogin(@Body JsonObject params);*/

/*    @GET("/todos/5")
    Call<JsonElement> getElement();*/

    @GET("/api/users?page=2")
    Call<JsonElement> getList();

}