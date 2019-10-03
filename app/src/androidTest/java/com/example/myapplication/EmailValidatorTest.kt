package com.example.myapplication

import androidx.test.rule.ActivityTestRule
import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test

class EmailValidatorTest {
    var emailActivityActivityTestRule = ActivityTestRule(EmailValidator::class.java)
    private var mActivity: EmailValidator? = null

    @Before
    fun setUp() {
        mActivity = emailActivityActivityTestRule.getActivity()

    }
    @Test
    fun testEmailValidator_validEmail() {
        assertTrue(EmailValidator().isValidEmail("name@email.com"));
    }
    @After
    fun tearDown() {
        mActivity = null
    }
}