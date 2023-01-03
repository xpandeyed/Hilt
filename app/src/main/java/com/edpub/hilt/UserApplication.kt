package com.edpub.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

//don't forget to make the entry in the manifest file
@HiltAndroidApp //must use annotation with Application class
class UserApplication: Application() {


    override fun onCreate() {
        super.onCreate()
    }
}