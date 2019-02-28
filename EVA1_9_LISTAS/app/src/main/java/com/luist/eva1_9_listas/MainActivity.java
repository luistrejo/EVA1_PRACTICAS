package com.luist.eva1_9_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView lstVwTitu;
    TextView txtVwDesc;
    static String[] asPelis = {
            "Las momias de Guanajuato",
            "El hombre araña",
            "Los Ilusionistas",
            "Interestelar",
            "Need for Speed",
            "Codigo Enigma",
            "Roma",
            "Transformers"
    };
    static String[] asSinopsis = {
            "Las momias de Guanajuato",
            "El hombre araña",
            "Los Ilusionistas",
            "Interestelar",
            "Need for Speed",
            "Codigo Enigma",
            "Roma",
            "Transformers"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstVwTitu = findViewById(R.id.listTitu);
        txtVwDesc = findViewById(R.id.txrVwDesc);

        lstVwTitu.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
                //Layout de los items
                android.R.layout.simple_list_item_1,
                //Datos
                asPelis));
        lstVwTitu.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtVwDesc.setText(asSinopsis[position]);
    }
}
