package com.example.myapplication;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class MainActivityTest {
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mainActivityActivityTestRule.getActivity();

    }

    @Test
    public void testLaunchOfNextActivityOnButtonClick() {

    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }


}