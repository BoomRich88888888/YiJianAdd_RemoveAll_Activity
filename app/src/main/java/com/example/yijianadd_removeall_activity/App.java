package com.example.yijianadd_removeall_activity;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;


public class App extends Application {
    public static List<Activity> mActivitysList = new ArrayList<>();
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
