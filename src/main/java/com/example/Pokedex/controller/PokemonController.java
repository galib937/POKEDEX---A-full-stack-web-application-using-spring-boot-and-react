package com.example.Pokedex.controller;

import com.example.Pokedex.model.Pokemon;
import com.example.Pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")

public class PokemonController {
    @Autowired
    private PokemonService pokemonService;
    @PostMapping("/add")
    public String add(@RequestBody Pokemon pokemon){
        pokemonService.savePokemon(pokemon);
        return "New pokemon is added";
    }
    @GetMapping("/getAll")
    public List<Pokemon>getAllPokemons(){
        return pokemonService.getAllPokemons();
    }
}
