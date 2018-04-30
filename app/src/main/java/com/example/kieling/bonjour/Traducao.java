package com.example.kieling.bonjour;

import java.io.Serializable;

/**
 * Created by kieling on 25/04/18.
 */

public class Traducao implements Serializable{
    String palavra;
    String traducao;
    String frase;

    Traducao(String palavra,String traducao,String frase){
        this.palavra = palavra;
        this.traducao = traducao;
        this.frase = frase;
    }
}
