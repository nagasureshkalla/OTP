package com.example.iedc.otp;

import retrofit2.Retrofit;

import retrofit2.converter.gson.GsonConverterFactory;



    public class Retrofit_Otp {

        public static final String BASE_URL="https://www.smsstriker.com/API/";

        public static Retrofit retrofit=null;

        public static Retrofit getRetrofitOTP() {

            if(retrofit==null){

                retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

            }

            return retrofit;

        }

    }