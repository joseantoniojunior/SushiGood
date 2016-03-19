package com.example.android.sushigood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Pedido Acess = new Pedido();
        String Lista = Acess.Resumo();
        displayResumo(Lista);
    }
    /*
        Método para exibir um Toast que indica que o pedido foi efetuado e pago.
    */
    public void Pagamento(View view) {
        String confirmacao = "Pedido efetuado com sucesso.";
        Toast.makeText(this, confirmacao, Toast.LENGTH_SHORT).show();
    }
    /*
        Método para mostrar produtos selecionados e o valor total a ser pago.
        OBS:Infelizmente, se um produto é escolhido, nem seu nome nem seu valor é repassado para
        o resumo.
    */
    public void displayResumo(String message) {
        TextView ResumoTextView = (TextView) findViewById(R.id.resumo_text);
        ResumoTextView.setText(message);
    }
}

