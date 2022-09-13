package com.example.itiproject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApi {
    @GET("movie/popular")
    Call<MovieResponse> getMovies(@Query("api_key")String apiKey);
}
