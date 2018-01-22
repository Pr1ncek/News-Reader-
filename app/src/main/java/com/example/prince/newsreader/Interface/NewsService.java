package com.example.prince.newsreader.Interface;

import com.example.prince.newsreader.Model.News;
import com.example.prince.newsreader.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Prince on 1/18/18.
 */

public interface NewsService {


    @GET("v1/sources?language=en")
    Call<WebSite> getSources();


    @GET
    Call<News> getNewestArticles(@Url String url);


}
