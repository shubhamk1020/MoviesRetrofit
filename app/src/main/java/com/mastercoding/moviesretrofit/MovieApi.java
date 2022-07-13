package com.mastercoding.moviesretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {

    //"https://run.mocky.io/v3/5bd716f9-261c-485e-bcfa-1475b3b244fd"

    @GET("v3/5bd716f9-261c-485e-bcfa-1475b3b244fd")
    Call<JSONResponse> getMovies();


}
