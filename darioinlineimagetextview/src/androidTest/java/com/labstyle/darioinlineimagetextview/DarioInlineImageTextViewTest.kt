package com.labstyle.darioinlineimagetextview

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DarioInlineImageTextViewTest {

    private val appContext = InstrumentationRegistry.getInstrumentation().targetContext
    private val textView = DarioInlineImageTextView(appContext)

    @Test
    fun setInlineImage_indexOutOfBound() {
        textView.text = "hello"
        textView.setInlineImage(imgResId = 123, atIndex = 10)
        assertEquals("hello", textView.text)
    }

    @Test
    fun setInlineImage_imResIdZero() {
        textView.text = "hello"
        textView.setInlineImage(imgResId = 0, atIndex = 1)
        assertEquals("hello", textView.text)
    }
}