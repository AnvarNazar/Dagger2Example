package com.anvar.dagger2example.car;

import android.util.Log;

import com.anvar.dagger2example.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drives " + this);
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
}
