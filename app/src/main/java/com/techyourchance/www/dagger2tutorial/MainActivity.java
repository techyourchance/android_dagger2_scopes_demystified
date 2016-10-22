package com.techyourchance.www.dagger2tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.techyourchance.www.dagger2tutorial.dependencyinjection.DaggerTutorialComponent;
import com.techyourchance.www.dagger2tutorial.dependencyinjection.TutorialComponent;
import com.techyourchance.www.dagger2tutorial.dependencyinjection.TutorialModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject NonScopedService mNonScopedService;

    private TutorialComponent mTutorialComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getTutorialComponent().inject(this);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    private TutorialComponent getTutorialComponent() {
        if (mTutorialComponent == null) {
            mTutorialComponent = DaggerTutorialComponent.builder()
                    .tutorialModule(new TutorialModule())
                    .build();
        }
        return mTutorialComponent;
    }
}
