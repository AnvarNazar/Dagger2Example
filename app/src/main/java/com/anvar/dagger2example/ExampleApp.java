package com.anvar.dagger2example;

import android.app.Application;

import com.anvar.dagger2example.dagger.AppComponent;
import com.anvar.dagger2example.dagger.DaggerAppComponent;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    /**
     * @return AppComponent
     */
    public AppComponent getAppComponent() {
        return component;
    }
}
