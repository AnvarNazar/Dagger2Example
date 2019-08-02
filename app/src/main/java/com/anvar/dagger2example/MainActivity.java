package com.anvar.dagger2example;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.anvar.dagger2example.car.Car;
import com.anvar.dagger2example.dagger.ActivityComponent;
import com.anvar.dagger2example.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(120));
        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
