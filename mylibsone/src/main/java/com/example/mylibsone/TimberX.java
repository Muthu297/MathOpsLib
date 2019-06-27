package com.example.mylibsone;

import timber.log.Timber;

public class TimberX {

    private static Boolean isInitialized = false;

    private static void init() {
        if (!isInitialized) {
            Timber.plant(new Timber.DebugTree());
            isInitialized = true;
        }
    }


    public static boolean debug(String msg) {

        init();

        Timber.d("From Timber :: %s", msg);

        return true;
    }


}
