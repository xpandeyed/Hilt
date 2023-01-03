package com.edpub.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint //must be used for activity class and fragment class if using hilt
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRepo: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userRepo.saveUser("lal", "la")
    }
}

//for every hilt project we need to define application class

//if fragment has @AndroidEntryPoint annotation then parent activity must have the same annotation
