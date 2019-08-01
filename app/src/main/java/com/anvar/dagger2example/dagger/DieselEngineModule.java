package com.anvar.dagger2example.dagger;

import com.anvar.dagger2example.car.DieselEngine;
import com.anvar.dagger2example.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine provideEngine(DieselEngine engine);
}
