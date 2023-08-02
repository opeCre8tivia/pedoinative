package com.odavolt.pedoi.appModule

import com.odavolt.pedoi.screens.auth.AuthViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


  @Singleton
  @Provides
  fun providesVm():AuthViewModel{
      return AuthViewModel()
  }
}