package com.example.android.testing.espresso.BasicSample.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.pages.MainPage
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.typeText
import org.junit.Assert

object MainPageSteps {

    fun fillTextFieldInput(value: String):MainPageSteps {
        MainPage.editTextUserInput.typeText(value)
        return this
    }

    fun clickOnChangeTextBtn():MainPageSteps {
        MainPage.changeTextBtn.tap()
        return this
    }

    fun checkPrintedText(expectedText: String):MainPageSteps {
        val actualText = MainPage.textToBeChanged.getText()
        Assert.assertEquals(expectedText, actualText)

        return this
    }

    fun deleteInputText():MainPageSteps {
        onView(MainPage.editTextUserInput).perform(clearText())
        return this
    }

    fun clickOnOpenActivityAndChangeTextBtn(): MainPageSteps {
        MainPage.activityChangeTextBtn.tap()
        return this
    }

}