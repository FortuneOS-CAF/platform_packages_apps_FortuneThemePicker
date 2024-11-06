package org.fortune.android.customization.picker

import android.app.Application;
import com.android.wallpaper.module.InjectorProvider;
import org.fortune.android.customization.module.FortuneThemePickerInjector;
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp(Application::class)
class FortuneCustomizationPickerApplication : Hilt_FortuneCustomizationPickerApplication() {

  @Inject
  lateinit var injector: FortuneThemePickerInjector

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(injector);
    }

}
