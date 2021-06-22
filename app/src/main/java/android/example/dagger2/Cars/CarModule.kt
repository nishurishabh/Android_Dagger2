package android.example.dagger2.Cars

import android.example.dagger2.Cars.ThirdPartyLibrary.Rim
import android.example.dagger2.Cars.ThirdPartyLibrary.Tire
import android.example.dagger2.Cars.ThirdPartyLibrary.Wheel
import dagger.Module
import dagger.Provides

@Module
class CarModule {

    @Provides
    fun provideRim(): Rim = Rim()

    @Provides
    fun provideTire(): Tire {
        var tire = Tire()
        tire.inflate()
        return tire
    }

    // provideRim provides Rim , provideTire provides tire with  inflated function called
    // We can provide wheels
    // Idea is we cannot add @Inject to constructor of third party library but we can call the constructors.

    @Provides
    fun provideWheel(tire: Tire, rim: Rim) = Wheel(tire, rim)
}