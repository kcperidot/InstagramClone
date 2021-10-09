package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MBbWtNVYRaIz6pioKVyo8okayEw4V7qUFrUNtvsr")
                .clientKey("e3i7upCmXzTsixKy8URHtBoTBDztclpQqz9l2xr3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
