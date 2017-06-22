package com.example.logonrm.androidrestapp.API;


public class APIUtils {

    public static final String BASE_URL = "http://www.mocky.io";

    public static AdroidAPI getAndroidAPIVersion() {
        return RetrofitClient.getClient(BASE_URL)
                .create(AdroidAPI.class);

    }
}
