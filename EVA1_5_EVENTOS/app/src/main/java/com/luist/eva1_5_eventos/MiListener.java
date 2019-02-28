package com.luist.eva1_5_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MiListener implements View.OnClickListener {
    Context context;

    public MiListener(Context context){
        this.context = context;
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(context, "Evento generado por Clase Externa", Toast.LENGTH_SHORT).show();
    }
}
