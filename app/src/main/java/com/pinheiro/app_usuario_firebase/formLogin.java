package com.pinheiro.app_usuario_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class formLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        //código para esconder a barra de navegação abaixo//

        getSupportActionBar().hide();
        CarregarComponentes();

        //------------------------------------------------//

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(formLogin.this,formCadastro.class);
                startActivity(intent);
            }
        });
    }

    private void CarregarComponentes(){
        text_tela_cadastro = findViewById(R.id.text_cadastro);
    }
}