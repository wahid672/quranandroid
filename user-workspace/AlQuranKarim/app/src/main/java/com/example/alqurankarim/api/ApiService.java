package com.example.alqurankarim.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("quran/{surah}/{ayat}")
    Call<QuranResponse> getQuranText(@Path("surah") int surah, @Path("ayat") int ayat);
}
