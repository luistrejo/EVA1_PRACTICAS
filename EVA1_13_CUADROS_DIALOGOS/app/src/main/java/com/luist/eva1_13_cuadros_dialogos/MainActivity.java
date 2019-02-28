package com.luist.eva1_13_cuadros_dialogos;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickDialogDef(View v) {
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de Dialogo de Android")
                .setMessage("Hola mundo cruel!!!")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Boton ok", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Boton No", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Boton Cancelar", Toast.LENGTH_SHORT).show();
                    }
                })
                .create().show();
    }

    public void clickDialogProp(View v) {
        final Dialog dlgMiDialogo;
        dlgMiDialogo = new Dialog(this);
        //El layput
        dlgMiDialogo.setContentView(R.layout.cuadro_layout);
        TextView txtVwTitulo;
        final EditText edtTxtNombre;
        Button btnOk;
        txtVwTitulo = dlgMiDialogo.findViewById(R.id.txtVwTitulo);
        edtTxtNombre = dlgMiDialogo.findViewById(R.id.editTxtNombre);
        btnOk = dlgMiDialogo.findViewById(R.id.btnOk);
        txtVwTitulo.setText("MI CUADRO DE DIALOGO");
        edtTxtNombre.setHint("Introduce tu nombre");
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), edtTxtNombre.getText().toString(), Toast.LENGTH_SHORT).show();
                dlgMiDialogo.cancel();
            }
        });
        dlgMiDialogo.show();
    }

}
