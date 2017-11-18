package com.dtechterminal.drcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {
    private PrefManager prefManager;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            startActivity(new Intent(this,IntroPage.class));
        }
        prefManager.setFirstTimeLaunch(false);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setFadeAnimation();
        // Note here that we DO NOT use setContentView();
        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
        addSlide(AppIntroFragment.newInstance("Welcome to Dr.Care", "Choose a doctor and we do the rest.", R.mipmap.a, ContextCompat.getColor(getApplicationContext(),R.color.slide1)));
        addSlide(AppIntroFragment.newInstance("Are you a Patient?", "Find the doctors in the easiest way possible.", R.mipmap.b, ContextCompat.getColor(getApplicationContext(),R.color.slide2)));
        addSlide(AppIntroFragment.newInstance("Are you a Doctor?", "Find the patients near your locality without any hassle!", R.mipmap.a, ContextCompat.getColor(getApplicationContext(),R.color.slide3)));
        showSkipButton(true);
        setProgressButtonEnabled(true);
        }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(this,IntroPage.class));
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(this,IntroPage.class));
    }
}
