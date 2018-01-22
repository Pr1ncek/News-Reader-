package com.example.prince.newsreader.Common;

import com.example.prince.newsreader.Interface.IconBetterIdeaService;
import com.example.prince.newsreader.Interface.NewsService;
import com.example.prince.newsreader.Remote.IconBetterIdeaClient;
import com.example.prince.newsreader.Remote.RetrofitClient;

import retrofit2.Retrofit;

/**
 * Created by Prince on 1/18/18.
 */

public class Common {


    private static final String BASE_URL = "https://newsapi.org/";


    public static final String API_KEY = "d867d47f62e74fb2a8389c8540e287d6";


    public static NewsService getNewsService(){


        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);


    }


    public static IconBetterIdeaService getIconService(){


        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);


    }

    public static String getAPIUrl(String source, String sortBy, String apiKEY){

        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v1/articles?source=");



        return apiUrl.append(source)
                .append("&sortBy=")
                .append(sortBy)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();



    }



}















