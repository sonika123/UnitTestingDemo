package com.example.myapplication

import android.app.Activity
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import junit.framework.Assert.*
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CalculatorActivityTest {
    @Rule
    @JvmField
    var calculatorActivityActivityTestRule = ActivityTestRule(CalculatorActivity::class.java)
    private var mActivity: CalculatorActivity? = null


    @Before
    fun setUp() {
        mActivity = calculatorActivityActivityTestRule.getActivity()
        assertNotNull(mActivity!!.findViewById(R.id.editTextNum2))
        println("Ready for testing!")
    }

    @After
    fun cleanup() {
        println("Done with unit test!")
    }


    @Test
    fun testTrueAdd() {
        println("activity instance " + mActivity)
        var total = mActivity?.addNumbers(1, 2)
        assertEquals(3, total)
    }

    @Test
    fun testFalseAdd() {
        println("activity instance " + mActivity)
        var total = mActivity?.addNumbers(1, 2)
        assertNotSame(5, total)
    }
}