package com.luist.eva1_12_listas_personalizadas;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstCiudades;
    static Clima[] acClimaCd = {
            new Clima(R.drawable.sunny, "Delicias", "Depejado", "Seco y Polvoriento", 16),
            new Clima(R.drawable.sunny, "Cuahutemoc", "Soleado", "Seco y humedo", 12),
            new Clima(R.drawable.light_rain, "Aldama", "Lluvia Ligera", "Humedo y nublado", 10),
            new Clima(R.drawable.light_rain, "Delicias", "Depejado", "Humedo", 15),
            new Clima(R.drawable.light_rain, "Chihuahua", "Soleado", "Seco y Polvoriento", 17),
            new Clima(R.drawable.snow, "Villa Ahumada", "Nevada", "Nevada Intensa", -7)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstCiudades = findViewById(R.id.lstCiudades);
        lstCiudades.setAdapter(new ClimaAdapter(this, R.layout.layout_clima, acClimaCd));
        lstCiudades.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, acClimaCd[position].getDesc_clima(), Toast.LENGTH_LONG).show();
        final Dialog dlgMiDialogo;
        dlgMiDialogo = new Dialog(this);
        //El layput
        dlgMiDialogo.setContentView(R.layout.layout_clima);
        ImageView imgVwClima;
        TextView txtVwCd, txtVwTemp, txtVwClima, txtVwDesc;
        Button btnCerrar = dlgMiDialogo.findViewById(R.id.btnCerrar);
        imgVwClima = dlgMiDialogo.findViewById(R.id.iVClima);
        txtVwCd = dlgMiDialogo.findViewById(R.id.txtCiudad);
        txtVwClima = dlgMiDialogo.findViewById(R.id.txtClima);
        txtVwDesc = dlgMiDialogo.findViewById(R.id.txtDesc);


        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlgMiDialogo.cancel();
            }
        });
        dlgMiDialogo.show();
    }
}
