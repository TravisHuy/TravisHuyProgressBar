package com.nhathuy.travishuyprogressbar

import android.content.Context
import android.util.AttributeSet

@JvmOverloads
fun createTravisHuyProgressBar(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): TravisHuyProgressBar = TravisHuyProgressBar(context, attrs, defStyleAttr)

var TravisHuyProgressBar.progress: Int
    get() = this.mProgress
    set(value) = this.setProgress(value)

var TravisHuyProgressBar.max: Int
    get() = this.mMax
    set(value) = this.setMax(value)

var TravisHuyProgressBar.startColor: Int
    get() = this.mStartColor
    set(value) = this.setStartColor(value)

var TravisHuyProgressBar.endColor: Int
    get() = this.mEndColor
    set(value) = this.setEndColor(value)

var TravisHuyProgressBar.cornerRadius: Float
    get() = this.mCornerRadius
    set(value) = this.setCornerRadius(value)

fun TravisHuyProgressBar.setColors(startColor: Int, endColor: Int) {
    this.setColors(startColor, endColor)
}

fun TravisHuyProgressBar.setGradientColors(colors: IntArray) {
    this.setGradientColors(colors)
}