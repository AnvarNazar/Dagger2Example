package com.anvar.dagger2example;

import android.app.Application;

import com.anvar.dagger2example.dagger.CarComponent;
import com.anvar.dagger2example.dagger.DaggerCarComponent;

public class ExampleApp extends Application {

    private CarComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerCarComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .build();
    }

    /**
     * @return AppComponent
     */
    public CarComponent getAppComponent() {
        return component;
    }
}
