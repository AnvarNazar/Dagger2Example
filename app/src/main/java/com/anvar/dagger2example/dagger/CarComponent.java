package com.anvar.dagger2example.dagger;

import com.anvar.dagger2example.MainActivity;
import com.anvar.dagger2example.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
