package com.alexmihai.mvp.data;

import com.alexmihai.mvp.data.model.response.Pokemon;
import com.alexmihai.mvp.data.remote.PokemonService;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class DataManager {

    private PokemonService pokemonService;

    @Inject
    public DataManager(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    public Single<List<String>> getPokemonList(int limit) {
        return pokemonService
                .getPokemonList(limit)
                .toObservable()
                .flatMapIterable(namedResources -> namedResources.results)
                .map(namedResource -> namedResource.name)
                .toList();
    }

    public Single<Pokemon> getPokemon(String name) {
        return pokemonService.getPokemon(name);
    }
}
