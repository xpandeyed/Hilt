package com.edpub.hilt

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email:String, password: String){
        Log.i("hilttest","sql")
    }
}
class FirebaseRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.i("hilttest", "firebase")
    }
}