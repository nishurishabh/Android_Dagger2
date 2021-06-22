package android.example.dagger2.Cars

import android.example.dagger2.MainActivity
import dagger.Component

@Component (modules = [CarModule::class])
interface CarComponent {
    fun getCars(): Car
    fun injectCar(mainActivity: MainActivity)
}