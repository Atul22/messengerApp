package com.example.atulkumar.messengerapp;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Atul Kumar on 16-12-2015.
 */
public class ChatAppSingleton extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        Parse.initialize(this);
    }
}
