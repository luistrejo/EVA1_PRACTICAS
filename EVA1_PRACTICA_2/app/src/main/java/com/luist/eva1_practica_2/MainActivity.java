package com.luist.eva1_practica_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eTxtAnioNac;
    RadioButton rBtnDesarrolladas, rBtnAmericaLatina, rBtnAsia, rBtnAfrica, rBtnHombre, rBtnMujer;
    TextView txtVwExpecVida, txtFechaDeceso;
    RadioGroup rGrpRegiones, rGrpSexo;
    Datos datos50 = new Datos(75, 60, 45, 35, 10);
    Datos datos60 = new Datos(75, 65, 50, 45, 9);
    Datos datos70 = new Datos(80, 70, 65, 55, 8);
    Datos datos80 = new Datos(80, 75, 65, 60, 7);
    Datos datos90 = new Datos(85, 75, 60, 55, 6);
    Datos datos00 = new Datos(90, 70, 65, 60, 4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTxtAnioNac = findViewById(R.id.eTxtAnio);
        rBtnDesarrolladas = findViewById(R.id.rBtnDesarrolladas);
        rBtnAmericaLatina = findViewById(R.id.rBtnAmericaLatina);
        rBtnAsia = findViewById(R.id.rBtnAsia);
        rBtnAfrica = findViewById(R.id.rBtnAfrica);
        rBtnHombre = findViewById(R.id.rBtnHombre);
        rBtnMujer = findViewById(R.id.rBtnMujer);
        txtVwExpecVida = findViewById(R.id.txtVwExpecVida);
        txtFechaDeceso = findViewById(R.id.txtVWAnioDeceso);
        rGrpRegiones = findViewById(R.id.rGrpRegiones);
        rGrpSexo = findViewById(R.id.rGrpSexo);
        eTxtAnioNac.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count == 4) {
                    clasificador();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void clasificador() {
        int iAnioNac = Integer.valueOf(eTxtAnioNac.getText().toString());
        if (iAnioNac >= 1950 && iAnioNac < 1960) {
            rGrpSexo.getCheckedRadioButtonId();
            calcular(datos50, rGrpRegiones.getCheckedRadioButtonId(), rGrpSexo.getCheckedRadioButtonId());
        } else if (iAnioNac >= 1960 && iAnioNac < 1970) {
            rGrpSexo.getCheckedRadioButtonId();
            calcular(datos60, rGrpRegiones.getCheckedRadioButtonId(), rGrpSexo.getCheckedRadioButtonId());
        } else if (iAnioNac >= 1970 && iAnioNac < 1980) {
            rGrpSexo.getCheckedRadioButtonId();
            calcular(datos70, rGrpRegiones.getCheckedRadioButtonId(), rGrpSexo.getCheckedRadioButtonId());
        } else if (iAnioNac >= 1980 && iAnioNac < 1990) {
            rGrpSexo.getCheckedRadioButtonId();
            calcular(datos80, rGrpRegiones.getCheckedRadioButtonId(), rGrpSexo.getCheckedRadioButtonId());
        } else if (iAnioNac >= 1990 && iAnioNac < 2000) {
            rGrpSexo.getCheckedRadioButtonId();
            calcular(datos90, rGrpRegiones.getCheckedRadioButtonId(), rGrpSexo.getCheckedRadioButtonId());
        } else if (iAnioNac >= 2000 && iAnioNac < 2010) {
            rGrpSexo.getCheckedRadioButtonId();
            calcular(datos00, rGrpRegiones.getCheckedRadioButtonId(), rGrpSexo.getCheckedRadioButtonId());
        } else {
            Toast.makeText(this, "Ingrese una fecha entre 1960 y 2010", Toast.LENGTH_LONG).show();
        }
    }

    private void calcular(Datos datos, int region, int sexo) {
        double dDifGenero = 0;
        dDifGenero = (datos.iDifGen /= 2);
        Log.d("Calculo", datos.iDifGen + "");
        switch (region) {
            case R.id.rBtnDesarrolladas:
                if (sexo != R.id.rBtnHombre)
                    calcularExpecVida(datos.iDesarrollados, dDifGenero, false);
                else calcularExpecVida(datos.iDesarrollados, dDifGenero, true);
                break;
            case R.id.rBtnAmericaLatina:
                if (sexo != R.id.rBtnHombre) calcularExpecVida(datos.iAmeLatina, dDifGenero, false);
                else calcularExpecVida(datos.iAmeLatina, dDifGenero, true);
                break;
            case R.id.rBtnAsia:
                if (sexo != R.id.rBtnHombre) calcularExpecVida(datos.iAsia, dDifGenero, false);
                else calcularExpecVida(datos.iAsia, dDifGenero, true);
                break;
            case R.id.rBtnAfrica:
                if (sexo != R.id.rBtnHombre) calcularExpecVida(datos.iAfrica, dDifGenero, false);
                else calcularExpecVida(datos.iAfrica, dDifGenero, true);
                break;
        }
    }

    //True: Hombre False: Mujer
    private void calcularExpecVida(double dExpecVida, double dDifGenero, boolean sexo) {
        if (sexo) {
            dExpecVida = dExpecVida - dDifGenero;
            txtVwExpecVida.setText(dExpecVida + "");
            int iFechaDec = Integer.valueOf(eTxtAnioNac.getText().toString() + dExpecVida);
            txtFechaDeceso.setText(iFechaDec);
        } else {
            dExpecVida = dExpecVida + dDifGenero;
            txtVwExpecVida.setText(dExpecVida + "");
            int iFechaDec = Integer.valueOf(eTxtAnioNac.getText().toString() + dExpecVida);
            txtFechaDeceso.setText(iFechaDec);

        }
    }
}
