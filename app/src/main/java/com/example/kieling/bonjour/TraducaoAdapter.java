package com.example.kieling.bonjour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kieling on 29/04/18.
 */

public class TraducaoAdapter extends ArrayAdapter<Traducao> implements Serializable {

    public TraducaoAdapter(Context context, List<Traducao> objects){
        super(context, 0, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView= convertView;

        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.item_traducao,parent,false);
        }

        Traducao current =getItem(position);

        TextView traducao = (TextView) listItemView.findViewById(R.id.txtTraducao);
        TextView palavra= (TextView) listItemView.findViewById(R.id.txtPalavra);

        traducao.setText(current.traducao.toString());
        palavra.setText(current.palavra.toString());

        return  listItemView;
    }
}

