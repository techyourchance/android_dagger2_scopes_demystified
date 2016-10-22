package com.techyourchance.www.dagger2tutorial.dependencyinjection;


import com.techyourchance.www.dagger2tutorial.MainActivity;

import dagger.Component;

@Component(modules = {TutorialModule.class})
public interface TutorialComponent {

    void inject(MainActivity mainActivity);

}
