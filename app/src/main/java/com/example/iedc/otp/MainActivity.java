package com.example.iedc.otp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send=(Button)findViewById(R.id.otp);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ApiInterface retroGet = Retrofit_Otp.getRetrofitOTP().create(ApiInterface.class);

                String un = "sasicollege", pass = "SITE2002", from = "INSITE", to = "9963912971", type = "1";

                Call<String> retro = retroGet.getOTP(un, pass, from, to, "this is otp message", type);

                retro.enqueue(new Callback<String>() {

                    @Override
                    public void onResponse(@NonNull Call<String> call, @NonNull Response<String> response) {

                    }

                    @Override

                    public void onFailure(@NonNull Call<String> call, @NonNull Throwable t) {

                    }

                });
            }
        });
    }
}
