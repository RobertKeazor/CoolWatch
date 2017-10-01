package exoplayer.coolexamples.coolwatch.base

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
  fun inject(app: App)
}
