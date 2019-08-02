package com.anvar.dagger2example.dagger;

import com.anvar.dagger2example.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}
