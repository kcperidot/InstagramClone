package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MBbWtNVYRaIz6pioKVyo8okayEw4V7qUFrUNtvsr")
                .clientKey("e3i7upCmXzTsixKy8URHtBoTBDztclpQqz9l2xr3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
