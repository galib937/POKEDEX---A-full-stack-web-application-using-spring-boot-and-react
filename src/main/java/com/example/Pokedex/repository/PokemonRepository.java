package com.example.Pokedex.repository;

import com.example.Pokedex.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon,Integer> {
}
