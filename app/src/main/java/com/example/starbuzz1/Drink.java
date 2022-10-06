package com.example.starbuzz1;

public class Drink {

    //Atributos
    private String name;
    private String description;
    private int imageResourceId;

    //Declarar lista de arreglo
    public static final Drink[] bebidas = {
            new Drink("Latte", "Una taza de cafe expreso con leche",R.drawable.latte),
            new Drink("Capuccino", "Cafe expreso con leche flameada",R.drawable.cappuccino),
            new Drink("Filter", "Una taza con granos de cafe de la mas alta calidad",R.drawable.filter)
    };

    //Constructor
    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    //Metodos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public String toString() {
        return name;
    }
}
