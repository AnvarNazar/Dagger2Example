package com.anvar.dagger2example.dagger;

import com.anvar.dagger2example.car.Engine;
import com.anvar.dagger2example.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine provideEngine(PetrolEngine engine);
}
