package com.example.nfp_produce.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nfp_produce.MainActivity;
import com.example.nfp_produce.R;
import com.example.nfp_produce.admin.AdminActivity;
import com.example.nfp_produce.rider.RiderActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToRider(View view) {
        startActivity(new Intent(this, RiderActivity.class));
    }

    public void goToUser(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void goToAdmin(View view) {
        startActivity(new Intent(this, AdminActivity.class));
    }
}