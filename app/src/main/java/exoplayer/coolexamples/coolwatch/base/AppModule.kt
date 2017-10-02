package exoplayer.coolexamples.coolwatch.base

import dagger.Module
import dagger.Provides

@Module
class AppModule(val app: App) {
  @Provides
  fun provideApp() = app
}
