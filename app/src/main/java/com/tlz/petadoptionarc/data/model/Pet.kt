package com.tlz.petadoptionarc.data.model

import androidx.annotation.DrawableRes

data class Pet(
    @DrawableRes val image: Int,
    val name: String,
    val gender: String,
    val age: String,
    val breed: String,
    val color: String,
    val location: String,
    val description: String,
    val owner: Owner,
    val id: Int

)
