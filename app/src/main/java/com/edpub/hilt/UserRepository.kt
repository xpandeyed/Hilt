package com.edpub.hilt

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(val loggerService: LoggerService) {
    fun saveUser(email:String, password: String){
        loggerService.log("my message")
    }

}