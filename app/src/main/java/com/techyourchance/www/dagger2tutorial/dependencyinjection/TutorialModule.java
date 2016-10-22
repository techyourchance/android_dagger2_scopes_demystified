package com.techyourchance.www.dagger2tutorial.dependencyinjection;

import com.techyourchance.www.dagger2tutorial.CustomScopedService;
import com.techyourchance.www.dagger2tutorial.NonScopedService;

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
    @CustomScope
    public CustomScopedService customScopedService() {
        return new CustomScopedService();
    }


}
