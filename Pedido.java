package com.example.android.sushigood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class Pedido extends AppCompatActivity {
    double valor = 0;
    boolean hasDinamite;
    boolean hasFuracao;
    boolean hasPhiladelphia;
    boolean hasTradicional;
    boolean hasTradicionalHot;
    boolean hasEspecial;
    boolean hasHossomaki;
    boolean hasUramaki;
    boolean hasNiguiri;
    boolean hasCanoa;
    boolean hasLancha;
    boolean hasIate;
    boolean hasHarumaki;
    boolean hasCeviche;
    boolean hasSunomono;
    boolean hasRefrigerante;
    boolean hasSuco;
    boolean hasCerveja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
    }

    /*
        Método para abrir tela do resumo do pedido e pagamento.
    */
    public void fecharpedido(View view) {

        Intent payment = new Intent(this, Payment.class);
        startActivity(payment);
        VerificaProdutos();
    }

    /*
        Métodos para verificar produtos selecionados e calcular preço.
    */
    public void VerificaProdutos() {
        CheckBox dinamiteCheckBox = (CheckBox) findViewById(R.id.dinamite_text);
        hasDinamite = dinamiteCheckBox.isChecked();
        Log.v("Payment", "Dinamite?" + hasDinamite);
        CheckBox furacaoCheckBox = (CheckBox) findViewById(R.id.furacao_text);
        hasFuracao = furacaoCheckBox.isChecked();
        Log.v("Payment", "Furacao?" + hasFuracao);
        CheckBox philadelphiaCheckBox = (CheckBox) findViewById(R.id.philadelphia_text);
        hasPhiladelphia = philadelphiaCheckBox.isChecked();
        Log.v("Payment", "Philadelphia?" + hasPhiladelphia);
        CheckBox tradicionalCheckBox = (CheckBox) findViewById(R.id.tradicional_text);
        hasTradicional = tradicionalCheckBox.isChecked();
        Log.v("Payment", "Tradicional?" + hasTradicional);
        CheckBox tradicionalhotCheckBox = (CheckBox) findViewById(R.id.tradicional_hot_text);
        hasTradicionalHot = tradicionalhotCheckBox.isChecked();
        Log.v("Payment", "TradicionalHot?" + hasTradicionalHot);
        CheckBox especialCheckBox = (CheckBox) findViewById(R.id.especial_text);
        hasEspecial = especialCheckBox.isChecked();
        Log.v("Payment", "Especial?" + hasEspecial);
        CheckBox hossomakiCheckBox = (CheckBox) findViewById(R.id.hossomaki_text);
        hasHossomaki = hossomakiCheckBox.isChecked();
        Log.v("Payment", "Hossomaki?" + hasHossomaki);
        CheckBox uramakiCheckBox = (CheckBox) findViewById(R.id.uramaki_text);
        hasUramaki = uramakiCheckBox.isChecked();
        Log.v("Payment", "Uramaki?" + hasUramaki);
        CheckBox niguiriCheckBox = (CheckBox) findViewById(R.id.niguiri_text);
        hasNiguiri = niguiriCheckBox.isChecked();
        Log.v("Payment", "Niguiri?" + hasNiguiri);
        CheckBox canoaCheckBox = (CheckBox) findViewById(R.id.canoa_text);
        hasCanoa = canoaCheckBox.isChecked();
        Log.v("Payment", "Canoa?" + hasCanoa);
        CheckBox lanchaCheckBox = (CheckBox) findViewById(R.id.lancha_text);
        hasLancha = lanchaCheckBox.isChecked();
        Log.v("Payment", "Lancha?" + hasLancha);
        CheckBox iateCheckBox = (CheckBox) findViewById(R.id.iate_text);
        hasIate = iateCheckBox.isChecked();
        Log.v("Payment", "Iate?" + hasIate);
        CheckBox huramakiCheckBox = (CheckBox) findViewById(R.id.huramaki_text);
        hasHarumaki = huramakiCheckBox.isChecked();
        Log.v("Payment", "Harumaki?" + hasHarumaki);
        CheckBox cevicheCheckBox = (CheckBox) findViewById(R.id.ceviche_text);
        hasCeviche = cevicheCheckBox.isChecked();
        Log.v("Payment", "Ceviche?" + hasCeviche);
        CheckBox sunomonoCheckBox = (CheckBox) findViewById(R.id.sunomono_text);
        hasSunomono = sunomonoCheckBox.isChecked();
        Log.v("Payment", "Sunomono?" + hasSunomono);
        CheckBox refrigeranteCheckBox = (CheckBox) findViewById(R.id.refrigerante_text);
        hasRefrigerante = refrigeranteCheckBox.isChecked();
        Log.v("Payment", "Refrigerante?" + hasRefrigerante);
        CheckBox sucoCheckBox = (CheckBox) findViewById(R.id.suco_text);
        hasSuco = sucoCheckBox.isChecked();
        Log.v("Payment", "Suco?" + hasSuco);
        CheckBox cervejaCheckBox = (CheckBox) findViewById(R.id.cerveja_text);
        hasCerveja = cervejaCheckBox.isChecked();
        Log.v("Payment", "Cerveja?" + hasCerveja);
    }
    public String Hot(boolean addDinamite, boolean addFuracao, boolean addPhiladelphia) {
        double resultado = 0;
        String hot = "Hot: ";
        if (addDinamite) {
            hot += "Dinamite ";
            resultado += 16.9;
        }
        if (addFuracao) {
            hot += "Furacao ";
            resultado += 16.9;
        }
        if (addPhiladelphia) {
            hot += "Philadelphia ";
            resultado += 17.9;
        }
        if (!addDinamite && !addFuracao && !addPhiladelphia) {
            return "" + hot + "R$" + resultado;
        }
        hot = hot + "$" + resultado;
        valor += resultado;
        return hot;
    }
    public String Temaki(boolean addTradicional, boolean addTradicionalHot, boolean addEspecial) {
        double resultado = 0;
        String temaki = "Temaki: ";
        if (addTradicional) {
            temaki += "Tradicional ";
            resultado += 16.9;
        }
        if (addTradicionalHot) {
            temaki += "Tradicional Hot ";
            resultado += 17.9;
        }
        if (addEspecial) {
            temaki += "Especial ";
            resultado += 18.9;
        }
        if (!addTradicional && !addTradicionalHot && !addEspecial) {
            return "" + temaki + "R$" + resultado;
        }
        temaki = temaki + "$" + resultado;
        valor += resultado;
        return temaki;
    }
    public String Tradicional(boolean addHossomaki, boolean addUramaki, boolean addNiguiri) {
        double resultado = 0;
        String tradicional = "Tradicional: ";
        if (addHossomaki) {
            tradicional += "Hossomaki ";
            resultado += 15.9;
        }
        if (addUramaki) {
            tradicional += "Uramaki ";
            resultado += 15.9;
        }
        if (addNiguiri) {
            tradicional += "Niguiri ";
            resultado += 10.0;
        }
        if (!addHossomaki && !addUramaki && !addNiguiri) {
            return "" + tradicional + "R$" + resultado;
        }
        tradicional = tradicional + "$" + resultado;
        valor += resultado;
        return tradicional;
    }
    public String Combos(boolean addCanoa, boolean addLancha, boolean addIate) {
        double resultado = 0;
        String combos = "Combos: ";
        if (addCanoa) {
            combos += "Canoa ";
            resultado += 25.5;
        }
        if (addLancha) {
            combos += "Lancha ";
            resultado += 35.9;
        }
        if (addIate) {
            combos += "Iate ";
            resultado += 45.5;
        }
        if (!addCanoa && !addLancha && !addIate) {
            return "" + combos + "R$" + resultado;
        }
        combos = combos + "$" + resultado;
        valor += resultado;
        return combos;
    }
    public String Outros(boolean addHarumaki, boolean addCeviche, boolean addSunomono) {
        double resultado = 0;
        String outros = "Outros: ";
        if (addHarumaki) {
            outros += "Harumaki ";
            resultado += 7.5;
        }
        if (addCeviche) {
            outros += "Ceviche ";
            resultado += 15.9;
        }
        if (addSunomono) {
            outros += "Sunomono ";
            resultado = 9.9;
        }
        if (!addHarumaki && !addCeviche && !addSunomono) {
            return "" + outros + "R$" + resultado;
        }
        outros = outros + "$" + resultado;
        valor += resultado;
        return outros;
    }
    public String Bebidas(boolean addRefrigerante, boolean addSuco, boolean addCerveja) {
        double resultado = 0;
        String bebidas = "Bebidas: ";
        if (addRefrigerante) {
            bebidas += "Refrigerante ";
            resultado += 3.5;
        }
        if (addSuco) {
            bebidas += "Suco ";
            resultado += 4.5;
        }
        if (addCerveja) {
            bebidas += "Cerveja ";
            resultado += 5.5;
        }
        if (!addRefrigerante && !addSuco && !addCerveja) {
            return "" + bebidas + "R$" + resultado;
        }
        bebidas = bebidas + "$" + resultado;
        valor += resultado;
        return bebidas;
    }
    /*
        Método para fazer lista de produtos e o total.
     */
    public String Resumo() {
        String resume = "" + Hot(hasDinamite, hasFuracao, hasPhiladelphia) +
                "\n" + Temaki(hasTradicional, hasTradicionalHot, hasEspecial) +
                "\n" + Tradicional(hasHossomaki, hasUramaki, hasNiguiri) +
                "\n" + Combos(hasCanoa, hasLancha, hasIate) +
                "\n" + Outros(hasHarumaki, hasCeviche, hasSunomono) +
                "\n" + Bebidas(hasRefrigerante, hasSuco, hasCerveja) +
                "\n" + "Total: R$" + valor;
        return resume;
    }
}


