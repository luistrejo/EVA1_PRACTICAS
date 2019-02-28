package com.luist.eva1_12_listas_personalizadas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaAdapter extends ArrayAdapter<Clima> {
    private Context cApp;
    private int iMiLayout;
    private Clima[] acDatos;

    public ClimaAdapter(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        cApp = context;
        iMiLayout = resource;
        acDatos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgVwClima;
        TextView txtVwCd, txtVwTemp, txtVwClima, txtVwDesc;

        View vwMiLayout = convertView;
        if (vwMiLayout == null) { //No existe la fila, hay que crearla
            LayoutInflater layoutInflater = ((Activity) cApp).getLayoutInflater();
            vwMiLayout = layoutInflater.inflate(iMiLayout, parent, false);
        }
        imgVwClima = vwMiLayout.findViewById(R.id.iVClima);
        txtVwTemp = vwMiLayout.findViewById(R.id.txtTemp);
        txtVwCd = vwMiLayout.findViewById(R.id.txtCiudad);
        txtVwClima = vwMiLayout.findViewById(R.id.txtClima);
        txtVwDesc = vwMiLayout.findViewById(R.id.txtDesc);
        Clima cClimaCd = acDatos[position];
        imgVwClima.setImageResource(cClimaCd.getImgClima());
        txtVwTemp.setText(cClimaCd.getClima() + " ºC");
        txtVwCd.setText(cClimaCd.getCiudad());
        txtVwClima.setText(cClimaCd.getClima());
        txtVwDesc.setText(cClimaCd.getDesc_clima());
        return vwMiLayout;

    }
}
