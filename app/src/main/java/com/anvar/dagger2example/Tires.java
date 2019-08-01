package com.anvar.dagger2example;

import android.util.Log;

class Tires {
    // we don't own this class so we can't annotate it with @Inject
    private static final String TAG = "Car";

    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}
