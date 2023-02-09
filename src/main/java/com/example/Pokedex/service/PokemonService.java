package com.example.Pokedex.service;

import com.example.Pokedex.model.Pokemon;

import java.util.List;

public interface PokemonService {
    public Pokemon savePokemon(Pokemon pokemon);
    public List<Pokemon> getAllPokemons();
}
