package com.example.android.testing.espresso.BasicSample.steps

import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.pages.ShowTextPage
import org.junit.Assert

object ShowTextPageSteps {

    fun checkPrintedText(expectedText: String):ShowTextPageSteps {
        val actualText = ShowTextPage.showTextView.getText()

        Assert.assertEquals(expectedText, actualText)
        return this
    }

}