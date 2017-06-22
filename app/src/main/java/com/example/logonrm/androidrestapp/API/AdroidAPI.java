package com.example.logonrm.androidrestapp.API;


import com.example.logonrm.androidrestapp.API.model.ResponseAndroid;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AdroidAPI {

    @GET("/v2/58af1fb21000001e1cc94547")
    Call<ResponseAndroid> getVersoes();

   //  http://www.mocky.io/v2/58af1fb21000001e1cc94547
}
