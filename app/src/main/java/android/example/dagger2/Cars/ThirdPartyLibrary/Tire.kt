package android.example.dagger2.Cars.ThirdPartyLibrary

import android.example.dagger2.Cars.ThirdPartyLibrary.Rim
import android.util.Log


class Tire constructor() {
    fun inflate() {
        Log.d("Car", "Tire inflated...")
    }
}