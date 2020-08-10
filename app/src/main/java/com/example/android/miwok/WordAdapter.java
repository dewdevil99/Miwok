package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int backgroundId;

    public WordAdapter(Activity context, ArrayList<Word> words, int backColor){
        super(context,0,words);
        backgroundId=backColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);
        TextView miwokText = listItemView.findViewById(R.id.miwok_text_view);
        miwokText.setText(currentWord.getMiwokTranslation());
        TextView defaultText = listItemView.findViewById(R.id.default_text_view);
        defaultText.setText(currentWord.getDefaultTranslation());

        ImageView image = listItemView.findViewById(R.id.image);
        if(currentWord.hasImageId()) {
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        }
        else{
            image.setVisibility(View.GONE);
        }

        View lineartext = listItemView.findViewById(R.id.linearText);
        int color = ContextCompat.getColor(getContext(),backgroundId);
        lineartext.setBackgroundColor(color);

        return listItemView;
    }
}
