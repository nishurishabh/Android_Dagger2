package android.example.dagger2.Cars

import android.example.dagger2.Cars.ThirdPartyLibrary.Tire
import android.example.dagger2.Cars.ThirdPartyLibrary.Wheel
import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheel: Wheel) {

    private val TAG = "Car"

    fun drive() {
        Log.d("Car", "driving... ")
    }

}