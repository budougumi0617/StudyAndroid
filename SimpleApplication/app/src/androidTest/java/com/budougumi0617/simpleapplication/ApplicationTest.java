package com.budougumi0617.simpleapplication;


import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.MediumTest;
import android.support.test.rule.ActivityTestRule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Rule;
import com.budougumi0617.simpleapplication.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@MediumTest // Filtering test size
public class ApplicationTest {

    @Rule // Initialize test case
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);


    @Test
    public void existStringHelloWorld() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }
}