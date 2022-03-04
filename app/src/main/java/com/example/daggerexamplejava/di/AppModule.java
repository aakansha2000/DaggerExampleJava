package com.example.daggerexamplejava.di;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String diString()
    {
        return "this is a sample string";
    }
}
