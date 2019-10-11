package com.example.myapplication

import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import junit.framework.Assert
import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class EmailValidatorTest {
    @Rule
    @JvmField
    var emailActivityActivityTestRule = ActivityTestRule(EmailValidator::class.java)
    private var mActivity: EmailValidator? = null

    @Before
    fun setUp() {
        mActivity = emailActivityActivityTestRule.getActivity()
        Assert.assertNotNull(mActivity!!.findViewById(R.id.editTextName))


    }
    @Test
    fun testNameValidator_validEmail() {
        assertTrue(mActivity!!.isNameValid("name@email.com"));
    }

    @Test
    fun testEmailValidator_validEmail() {
        assertTrue(mActivity!!.isValidEmail("name@email.com"));
    }

    @After
    fun tearDown() {
        mActivity = null
    }
}