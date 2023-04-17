package com.Pokedex.Utilidades;

import com.Pokedex.Pokemon.Pokemon;

public class ListaPokemon {

    protected Pokemon[] pokemonArray;
    protected int totalPokemon = 0;

    public ListaPokemon() {
        this.pokemonArray = new Pokemon[1];
    }

    public void añadirPokemon(Pokemon nuevoPokemon) {
        Pokemon[] nuevoPokemonArray = new Pokemon[this.totalPokemon + 1];

        for (int i = 0; i < this.pokemonArray.length; i++) {
            nuevoPokemonArray[i] = this.pokemonArray[i];
        }
    }
}
