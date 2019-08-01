package com.anvar.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anvar.dagger2example.car.Car;
import com.anvar.dagger2example.dagger.CarComponent;
import com.anvar.dagger2example.dagger.DaggerCarComponent;
import com.anvar.dagger2example.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();
        component.inject(this);

        car.drive();
    }
}
