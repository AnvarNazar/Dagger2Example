package com.anvar.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anvar.dagger2example.car.Car;
import com.anvar.dagger2example.dagger.CarComponent;
import com.anvar.dagger2example.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = ((ExampleApp) getApplication()).getAppComponent();
        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
