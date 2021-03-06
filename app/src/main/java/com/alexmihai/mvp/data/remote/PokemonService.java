package com.alexmihai.mvp.data.remote;

import com.alexmihai.mvp.data.model.response.Pokemon;
import com.alexmihai.mvp.data.model.response.PokemonListResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonService {

    @GET("pokemon")
    Single<PokemonListResponse> getPokemonList(@Query("limit") int limit);

    @GET("pokemon/{name}")
    Single<Pokemon> getPokemon(@Path("name") String name);
}
