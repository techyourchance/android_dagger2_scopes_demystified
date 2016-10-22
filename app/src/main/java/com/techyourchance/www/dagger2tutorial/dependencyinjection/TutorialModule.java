package com.techyourchance.www.dagger2tutorial.dependencyinjection;

import com.techyourchance.www.dagger2tutorial.NonScopedService;
import com.techyourchance.www.dagger2tutorial.SingletonScopedService;

import javax.inject.Singleton;

import dagger.Provides;
import dagger.Module;

@Module
public class TutorialModule {

    @Provides
    public NonScopedService nonScopedService() {
        return new NonScopedService();
    }

    @Provides
    @Singleton
    public SingletonScopedService singletonScopedService() {
        return new SingletonScopedService();
    }

}
