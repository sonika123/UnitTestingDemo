package com.example.myapplication

import androidx.test.rule.ActivityTestRule
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestName

class CalculationTest {
    var calculateActivityActivityTestRule = ActivityTestRule(Calculation::class.java)
    private var mActivity: Calculation? = null

    @Before
    fun setUp() {
        mActivity = calculateActivityActivityTestRule.getActivity()

    }
    @Test
    fun testadd() {
        var total = Calculation().add(4, 5)
        assertEquals(" adding incorrectly", 9, total)
    }
    @Test
    fun testsubtract() {
        var result = Calculation().subtract(6, 3)
        assertEquals("calculation subtract success", 3, result);

    }
    @After
    fun tearDown() {
        mActivity = null
    }


}