package com.edpub.hilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
abstract class UserModule {

    //This could also be used but bind is more preferred
//    @Provides
//    fun providesUserRepository(sqlRepository: SQLRepository):UserRepository{
//        return sqlRepository
//    }

    @Binds
    abstract fun bindsFirebaseRepository(firebaseRepository: FirebaseRepository):UserRepository
}