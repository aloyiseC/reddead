package com.internetbrands.reddeadclothes.di

import com.internetbrands.reddeadclothes.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


/**
Created by Wei Lai 2020/4/22
Description:
 */
@Singleton
@Component(modules = [AndroidSupportInjectionModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: App): Builder
        fun build(): AppComponent
    }
    fun inject(app: App)
}