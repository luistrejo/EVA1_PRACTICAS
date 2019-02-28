package com.luist.eva1_6_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup rGrpProfesores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rGrpProfesores = findViewById(R.id.rGrpMaestros);
        rGrpProfesores.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rBtnMartina:
                Toast.makeText(this, "90", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rBtnArzola:
                Toast.makeText(this, "85", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rBtnCamacho:
                Toast.makeText(this, "70", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rBtnRuben:
                Toast.makeText(this, "80", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rBtnTalavera:
                Toast.makeText(this, "75", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
