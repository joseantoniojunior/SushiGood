package com.example.android.sushigood;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
        Método para ir a escolha de pedido.
    */
    public void Pedir(View view) {
        Intent pedido = new Intent(this, Pedido.class);
        startActivity(pedido);
    }
    /*
        Método para criar e-mail de tira-dúvidas.
    */
    public void Contact(View view){
        String assunto = "Dúvidas!";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:contato@sushigood.com.br"));
        intent.putExtra(Intent.EXTRA_SUBJECT, assunto);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
