package com.luist.eva1_practica_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rBtnAmericano, rBtnCapuchino, rBtnExpresso;
    EditText eTxtCantidad;
    CheckBox checkAzucar, checkCrema;
    TextView txtVwDesc;
    Button btnTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rBtnAmericano = findViewById(R.id.rBtnAmericano);
        rBtnCapuchino = findViewById(R.id.rBtnCapuchino);
        rBtnExpresso = findViewById(R.id.rBtnExpresso);
        eTxtCantidad = findViewById(R.id.eTxtCantidad);
        checkAzucar = findViewById(R.id.checkBoxAzucar);
        checkCrema = findViewById(R.id.checkBoxCrema);
        txtVwDesc = findViewById(R.id.txtVwDesc);
        btnTotal = findViewById(R.id.btnTotal);

        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total = 0;

                if (eTxtCantidad.getText().length() > 0) {
                    if (rBtnAmericano.isChecked()) {
                        total += 20;
                        txtVwDesc.setText("Americano");
                    } else if (rBtnCapuchino.isChecked()) {
                        total += 48;
                        txtVwDesc.setText("Capuchino");
                    } else {
                        total += 30;
                        txtVwDesc.setText("Expresso");
                    }
                    if (checkAzucar.isChecked()) {
                        total += 1;
                        txtVwDesc.append(", Azucar");
                    }
                    if (checkCrema.isChecked()) {
                        total += 1;
                        txtVwDesc.append(", Crema");
                    }

                    total *= Integer.valueOf(eTxtCantidad.getText().toString());
                    Toast.makeText(getApplicationContext(), "$" + total, Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
