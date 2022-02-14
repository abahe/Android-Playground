package com.pupanka.getapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://api.ipify.org/";
    @GET("?format=json")
    Call<Results> getData();
}