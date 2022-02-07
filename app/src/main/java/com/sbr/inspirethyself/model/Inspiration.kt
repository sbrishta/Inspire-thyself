package com.sbr.inspirethyself.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Inspiration(
    @StringRes val stringResourceId:Int,
    @DrawableRes val drawableResourceId:Int)
