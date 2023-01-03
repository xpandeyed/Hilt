package com.edpub.hilt

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email:String, password: String){
        Log.i("hilttest", "$email $password")
    }

}