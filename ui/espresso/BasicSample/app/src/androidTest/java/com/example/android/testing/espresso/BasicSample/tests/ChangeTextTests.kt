package com.example.android.testing.espresso.BasicSample.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.data.ConstantData
import com.example.android.testing.espresso.BasicSample.steps.MainPageSteps
import com.example.android.testing.espresso.BasicSample.steps.ShowTextPageSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {
    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun typeFullNameAndCheckPrintedName() {
        MainPageSteps
            .fillTextFieldInput(ConstantData.FULL_NAME)
            .clickOnChangeTextBtn()
            .checkPrintedText(ConstantData.FULL_NAME)
    }

    @Test
    fun typeMovieNameAndCheckPrintedName() {
        MainPageSteps
            .fillTextFieldInput(ConstantData.FAVORITE_MOVIE_NAME)
            .clickOnChangeTextBtn()
            .checkPrintedText(ConstantData.FAVORITE_MOVIE_NAME)
            .deleteInputText()
            .fillTextFieldInput(ConstantData.FAVORITE_MOVIE_NAME_2)
            .clickOnOpenActivityAndChangeTextBtn()

        ShowTextPageSteps.checkPrintedText(ConstantData.FAVORITE_MOVIE_NAME_2)
    }

}