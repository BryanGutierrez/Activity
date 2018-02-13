package com.example.bryan.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> ar;
    ArrayAdapter<String> ad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);
        ar = new ArrayList<String>();
        //ar.add("add");
        ar.add("onCreate()\n\n Debe implementarse esta devolución de llamada, que se activa cuando el sistema crea la actividad por primera vez." );
        ar.add("onStart()\n\n Cuando la actividad ingresa al estado iniciado, el sistma invoca esta devolución de llamada.");
        ar.add("onResume()\n\n Cuando la actividad ingresa en e estado reanudado, pasa al primer plano, y luego el sistema invoca la devolución de llamada onResume().");
        ar.add("onPause()\n\n El sistema llama a este método como la primera indicación de que el usuario está dejandosu actividad.");
        ar.add("onStop()\n\n Cuando su actividad ya no es visible para el usuario, ha entrado en el estado Detenido y el sistema invoca la devolución de llamada onStop().");
        ar.add("onDestroy\n\n Llamado antes de que se destruya la actividad.");
        ad = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ar);
        lv.setAdapter(ad);


    }
}
