package com.example.starbuzz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINK = "drinkid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //Extraer nombre de la bebida a mostrar
        int drinkid =(Integer) getIntent().getExtras().get(EXTRA_DRINK);
        Drink bebidas = Drink.bebidas[drinkid];

        //mostrar layout
        TextView nombre= (TextView) findViewById(R.id.name);
        nombre.setText(bebidas.getName());
        TextView decription= (TextView) findViewById(R.id.description);
        decription.setText(bebidas.getDescription());
        ImageView img = (ImageView) findViewById(R.id.photo);
        img.setImageResource(bebidas.getImageResourceId());
        img.setContentDescription(bebidas.getName());
    }
}