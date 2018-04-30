package com.example.kieling.bonjour;

import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Traducao> traducoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cardNumber = (Button) findViewById(R.id.listNumbers);
        Button cardParent = (Button) findViewById(R.id.listParents);
        Button cardFoods = (Button) findViewById(R.id.listFoods);
        Button cardConversation = (Button) findViewById(R.id.listConversation);

        traducoes = new ArrayList<Traducao>();
        final Context self = this;

        cardNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                traducoes.add(new Traducao("Un","Um","Une pomme"));
                traducoes.add(new Traducao("Deux","Dois","Duex pomme"));
                traducoes.add(new Traducao("Trois","Tres","Trois pomme"));
                traducoes.add(new Traducao("Quatre","Quatro","Quatre pomme"));
                traducoes.add(new Traducao("Cinq","Cinco","Cinq pomme"));
                traducoes.add(new Traducao("Six","Seis","Six pomme"));
                traducoes.add(new Traducao("Sept","Sete","Sept pomme"));
                traducoes.add(new Traducao("Huit","Oito","Huit pomme"));
                traducoes.add(new Traducao("Neuf","Nove","Neuf pomme"));
                traducoes.add(new Traducao("Dix","Dez","Dix pomme"));

                Intent it = new Intent(self, Lista.class);
                it.putExtra("lista",traducoes);
                startActivity(it);
            }
        });

        cardParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                traducoes.add(new Traducao("Papa","Pai","Cool papa"));
                traducoes.add(new Traducao("Grand-mère","Pai","La grand-mère est démodée"));
                traducoes.add(new Traducao("Frère","Irmao","Frère drôle"));
                traducoes.add(new Traducao("Maman","Mae","Maman aime le football"));

                Intent it = new Intent(self, Lista.class);
                it.putExtra("lista",traducoes);
                startActivity(it);
            }
        });

        cardFoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                traducoes.add(new Traducao("Banana","Banane","Une pomme"));
                traducoes.add(new Traducao("Laranja","Orange","I'orange est bonne"));
                traducoes.add(new Traducao("Pasteque","Melancia","la pasteque est delicieuse"));

                Intent it = new Intent(self, Lista.class);
                it.putExtra("lista",traducoes);
                startActivity(it);
            }
        });

        cardConversation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                traducoes.add(new Traducao("Un taré","Um Louco"," Arrête d’agir comme un taré !"));
                traducoes.add(new Traducao("Kiffer","E sobre o uso de Hashishe utilizado entre usuarios","J’adore cette fête, je kiffe vraiment"));
                traducoes.add(new Traducao("Bosser","Trabalho Duro","Je dois bosser demain"));
                traducoes.add(new Traducao("On se capte plus tard","Um ate mais, casul","Ciao, David. On se capte plus tard !"));
                traducoes.add(new Traducao("Ferme ta gueule !","Cale a boca","Je dois fermer ma gueule ? ! Mais c’est toi qui es en train de parler !"));
                Intent it = new Intent(self, Lista.class);
                it.putExtra("lista",traducoes);
                startActivity(it);
            }
        });
    }

    @Override
    protected void onResume() {
        traducoes.removeAll(traducoes);
        super.onResume();
    }
}
