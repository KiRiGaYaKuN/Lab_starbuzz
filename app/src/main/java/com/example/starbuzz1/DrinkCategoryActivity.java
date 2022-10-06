package com.example.starbuzz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        //Definir el adaptador
        ArrayAdapter<Drink> listadapter = new ArrayAdapter<Drink>(this, android.R.layout.simple_list_item_1,Drink.bebidas);

        ListView listaBebidas= (ListView) findViewById(R.id.lista_bebidas);
        listaBebidas.setAdapter(listadapter);

        //crear el escucha evento
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //pasar la bebida al click del usuario
                Intent intent = new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
                intent.putExtra(DrinkActivity.EXTRA_DRINK, (int) id);
                startActivity(intent);
            }
        };

        //asignar escucha
        listaBebidas.setOnItemClickListener(itemClickListener);
    }
}