package com.techyourchance.www.dagger2tutorial.dependencyinjection;

import com.techyourchance.www.dagger2tutorial.NonScopedService;

import dagger.Provides;
import dagger.Module;

@Module
public class TutorialModule {

    @Provides
    public NonScopedService nonScopedService() {
        return new NonScopedService();
    }

}
