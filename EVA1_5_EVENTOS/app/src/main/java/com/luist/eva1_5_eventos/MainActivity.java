package com.luist.eva1_5_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Evento con clase Anonima
        Button btnListener = findViewById(R.id.btnListener);
        btnListener.setOnClickListener(this);
        Button btnClaseAnon = findViewById(R.id.btnClaseAnon);
        btnClaseAnon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Evento generado por Clase Anonima", Toast.LENGTH_SHORT).show();
            }
        });

        //Evento con clase externa
        MiListener miListener = new MiListener(getApplicationContext());
        Button btnClaseExterna = findViewById(R.id.btnClaseExterna);
        btnClaseExterna.setOnClickListener(miListener);
    }

    public void onClickXML(View v) {
        Toast.makeText(this, "Evento generado por propiedad OnClick", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Evento generado por Listener", Toast.LENGTH_SHORT).show();
    }
}
