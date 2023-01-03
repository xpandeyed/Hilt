package com.edpub.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint //must be used for activity class and fragment class if using hilt
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mf = MainFragment()

    }
}

//for every hilt project we need to define application class

//if fragment has @AndroidEntryPoint annotation then parent activity must have the same annotation

//There are certain scenarios where we cannot use @Inject:
//1. For third party library classes (we cannot modify the classes)
//2. Interfaces and abstract classes as we cannot create their objects.
//Here comes the module