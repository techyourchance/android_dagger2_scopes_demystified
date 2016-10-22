package com.techyourchance.www.dagger2tutorial.dependencyinjection;


import com.techyourchance.www.dagger2tutorial.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TutorialModule.class})
public interface TutorialComponent {

    void inject(MainActivity mainActivity);

}
