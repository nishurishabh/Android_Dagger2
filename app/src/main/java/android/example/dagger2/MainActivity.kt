package android.example.dagger2

import android.example.dagger2.Cars.Car
import android.example.dagger2.Cars.DaggerCarComponent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import dagger.Component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    Summary:
//    - Car requires Engine and Wheel
//    - Engine's constructor can be provided with constructor injection
//    - @Inject can be used.
//    - Wheel is a third party library so we cannot modify the code for wheel
//    - Used @Module with @Provides to inject wheels to make finally inject car.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carWithConstructorInjection()
        carWithFieldInjection()
    }

    private lateinit var car1: Car
    private fun carWithConstructorInjection() {
        val carComponent = DaggerCarComponent.builder().build()
        car1 = carComponent.getCars()
        Log.d("Car", "Car1 drive() called (Constructor Injection)")
        car1.drive()
    }

    @Inject lateinit var car2: Car
    private fun carWithFieldInjection() {
        Log.d("Car", "Car2 drive() called (Field Injection)")
        DaggerCarComponent.create().injectCar(this)
        car2.drive()
    }
}
