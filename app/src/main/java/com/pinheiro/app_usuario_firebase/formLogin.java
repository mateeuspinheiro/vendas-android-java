package com.pinheiro.app_usuario_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class formLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        //código para esconder a barra de navegação abaixo//

        getSupportActionBar().hide();

        //------------------------------------------------//


    }
}