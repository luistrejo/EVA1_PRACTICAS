package com.luist.eva1_7_eventos_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup rGrpIdioma;
    RadioButton rBtnEspañol, rBtnIngles;
    TextView txtNombre, txtApellido;
    EditText eTxtNombre, eTxtApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rGrpIdioma = findViewById(R.id.rGrpIdioma);
        rBtnEspañol = findViewById(R.id.rBtnEspañol);
        rBtnIngles = findViewById(R.id.rBtnIngles);
        txtNombre = findViewById(R.id.txtVNombre);
        txtApellido = findViewById(R.id.txtVApellido);
        eTxtNombre = findViewById(R.id.eTxtNombre);
        eTxtApellido = findViewById(R.id.eTxtApellido);

        rGrpIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.rBtnEspañol){
            rBtnEspañol.setText(R.string.idioma_es_es);
            rBtnIngles.setText(R.string.idioma_en_es);
            txtNombre.setText(R.string.nom_es);
            txtApellido.setText(R.string.ape_es);
            eTxtNombre.setText(R.string.hint_nom_es);
            eTxtApellido.setText(R.string.hint_ape_es);
        } else {
            rBtnEspañol.setText(R.string.idioma_es_en);
            rBtnIngles.setText(R.string.idioma_en_en);
            txtNombre.setText(R.string.nom_en);
            txtApellido.setText(R.string.ape_en);
            eTxtNombre.setText(R.string.hint_nom_en);
            eTxtApellido.setText(R.string.hint_ape_en);
        }
    }
}
