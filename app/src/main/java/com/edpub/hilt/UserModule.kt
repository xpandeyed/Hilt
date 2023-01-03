package com.edpub.hilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

//    This could also be used but bind is more preferred
    @Provides
    @Named("SQL")
    fun providesUserRepository(sqlRepository: SQLRepository):UserRepository{
        return sqlRepository
    }

    @Provides
    @FirebaseUserRepo
    fun providesFirebaseRepository(firebaseRepository: FirebaseRepository):UserRepository{
        return firebaseRepository
    }

//    @Binds
//    abstract fun bindsFirebaseRepository(firebaseRepository: FirebaseRepository):UserRepository
}

//Since we have two functions to provide the UserRepository, the hilt will get confused
//And Duplicate binding error will be thrown here
//So every time we need a UserRepository object we need to explicitly let the hilt know that which object are we demanding
//For that we use qualifiers
//Qualifiers are nothing but tags

//But in case of @Named annotation, we are passing a string, that can is error prone
//So we can create our own custom annotations
