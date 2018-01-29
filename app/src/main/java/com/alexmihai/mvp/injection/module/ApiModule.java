package com.alexmihai.mvp.injection.module;

import com.alexmihai.mvp.data.remote.PokemonService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module(includes = {NetworkModule.class})
public class ApiModule {

    @Provides
    @Singleton
    PokemonService providePokemonApi(Retrofit retrofit) {
        return retrofit.create(PokemonService.class);
    }
}
