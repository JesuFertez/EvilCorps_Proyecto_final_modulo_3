package com.evil_corps.checkapartment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.evil_corps.checkapartment.databinding.LoginActivityBinding;

public class LoginActivity extends AppCompatActivity {

    public LoginActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBinding();
        setContentView(binding.getRoot());
        setOnClicListener();

    }

    private void setOnClicListener() {
        binding.btnIngresar.setOnClickListener(v -> {

        Intent intent = new Intent(this, ContenedorFragmentos.class);
        startActivity(intent);

        });
    }

    private void initBinding() {
        binding = LoginActivityBinding.inflate(getLayoutInflater());
    }

}