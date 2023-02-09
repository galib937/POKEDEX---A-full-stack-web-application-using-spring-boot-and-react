package com.example.Pokedex.service;

import com.example.Pokedex.model.Pokemon;
import com.example.Pokedex.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImplementation implements PokemonService{
    @Autowired
    private PokemonRepository pokemonRepository;
    @Override
    public Pokemon savePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }
}
