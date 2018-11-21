package com.example.iedc.otp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("sms.php")
    Call<String> getOTP(@Query("username") String un, @Query("password") String pass, @Query("from") String from, @Query("to")String to, @Query("msg") String msg, @Query("type") String type);
}
