package com.Pokedex.Utilidades;

import com.Pokedex.Pokemon;

public class ListaPokemon {

    protected Pokemon arrayPokemon[] = new Pokemon[1];


    int contador = 0;

    public void añadirPokemon(Pokemon nuevoPokemon) {
        arrayPokemon[contador] = nuevoPokemon;
        contador++;
    }
}
