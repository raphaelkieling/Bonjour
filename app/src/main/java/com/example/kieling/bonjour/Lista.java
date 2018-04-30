package com.example.kieling.bonjour;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class Lista extends AppCompatActivity {
    TraducaoAdapter adapter;
    ArrayList<Traducao> traducoes;
    ListView listV;
    TextToSpeech ttobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        traducoes = (ArrayList<Traducao>) getIntent().getSerializableExtra("lista");
        adapter = new TraducaoAdapter(this, traducoes);

        listV = (ListView) findViewById(R.id.listaTraducoes);
        listV.setAdapter(adapter);

        ttobj = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ttobj.setLanguage(Locale.FRANCE);
            }
        });

        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Traducao t = (Traducao) parent.getItemAtPosition(position);
                ttobj.speak(t.frase,TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(getApplicationContext(), t.frase,Toast.LENGTH_LONG).show();
            }
        });



    }

    @Override
    public void onBackPressed() {
        adapter.clear();
        adapter.notifyDataSetChanged();
        listV.setAdapter(null);
        super.onBackPressed();
    }
}