package com.aya.mvvm_with_hilt_rxjava

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET




interface PokeApiService {
    @GET("pokemon")
    fun getPokemons(): Observable<PokemonResponse?>?
}