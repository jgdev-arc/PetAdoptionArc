package com.tlz.petadoptionarc.data.model

import androidx.annotation.DrawableRes

data class Owner(
    val name: String,
    val basicInfo: String,
    @DrawableRes val image: Int
)
