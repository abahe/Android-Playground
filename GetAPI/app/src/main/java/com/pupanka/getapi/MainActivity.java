package com.pupanka.getapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = (TextView) findViewById(R.id.tv_info);

        getData();
    }

    private void getData() {
        Call<Results> call = RetrofitClient.getInstance().getMyApi().getData();
        call.enqueue(new Callback<Results>() {
            @Override
            public void onResponse(Call<Results> call, Response<Results> response) {

                Results res = response.body();

                Log.e("xlogx","hasil : " + res.getIp() );

                tvInfo.setText(res.getIp());
            }

            @Override
            public void onFailure(Call<Results> call, Throwable t) {
                Log.e("xlogx","fail" + t.getMessage());
            }

        });
    }
}