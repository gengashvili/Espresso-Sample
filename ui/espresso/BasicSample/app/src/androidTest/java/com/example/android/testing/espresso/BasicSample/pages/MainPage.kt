package com.example.android.testing.espresso.BasicSample.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object MainPage {
    val editTextUserInput: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }
    val textToBeChanged: Matcher<View> by lazy { ViewMatchers.withId(R.id.textToBeChanged) }
    val changeTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.changeTextBt) }
    val activityChangeTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.activityChangeTextBtn) }
}