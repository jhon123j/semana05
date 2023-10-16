package com.example.appintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.appintents.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnRegsitro.setOnClickListener(this);
        binding.btnListado.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == binding.btnListado.getId()){
            startActivity(new Intent(
                    MainActivity.this,
                    ListaActivity.class
            ));
        }else if (v.getId() == binding.btnRegsitro.getId()){
            startActivity(new Intent(
                    MainActivity.this,
                    RegistroActivity.class
            ));
        }else {
                Toast.makeText(this, "Opcion no encontrada", Toast.LENGTH_SHORT).show();
                //El toast muestra un mensaje gris al cliente
        }
    }
}