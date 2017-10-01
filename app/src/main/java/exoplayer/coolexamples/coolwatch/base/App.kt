package exoplayer.coolexamples.coolwatch.base

import android.app.Application

class App : Application() {
  val appComponent: AppComponent by lazy {
    DaggerAppComponent
        .builder()
        .appModule(AppModule(this))
        .build()
  }

  override fun onCreate() {
    super.onCreate()
    appComponent.inject(this)
  }

  fun appComponent() : AppComponent = appComponent
}
