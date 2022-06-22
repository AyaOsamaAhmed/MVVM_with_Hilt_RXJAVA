package com.aya.mvvm_with_hilt_rxjava

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent.class)
class NetworkModule {

    @Provides
    @Singleton
    fun providePokemonApiService(): PokeApiService? {
        return Retrofit.Builder()
            .baseUrl(" https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
            .create(PokeApiService::class.java)
    }
}