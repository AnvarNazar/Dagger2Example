package com.anvar.dagger2example;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
