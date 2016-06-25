package com.example.myathtut.joke;

import android.app.Application;
import android.content.Context;

/**
 * Created by myathtut on 6/25/16.
 */
public class JokeApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
