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

    public void eliminarPokemon(Pokemon nombre) {
        boolean encontrado = false;
        for (int i = 0; i < this.pokemonArray.length ; i++) {
            if (this.pokemonArray[i].getNombre().equalsIgnoreCase(Pokemon nombre)) {
                for (int j = i; j < this.pokemonArray.length - 1; j++) {
                    pokemonArray[j] = pokemonArray[j + 1];
                }
                pokemonArray--;
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El Pokémon ha sido eliminado de la lista.");
        } else {
            System.out.println("El Pokémon no ha sido encontrado en la lista.");
        }
    }

    public void mostrar() {

        System.out.println("Muestra el listado de las publicaciones");
        for (int i = 0; i < pokemonArray.length; i++) {
            if (pokemonArray[i] != null) {
                System.out.println(pokemonArray[i]);
            }
        }
    }
}
