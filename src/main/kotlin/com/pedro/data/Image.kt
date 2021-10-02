package com.pedro.data


import kotlinx.serialization.Serializable


@Serializable
data class Image(
    val name : String,
    val description : String,
    val img_Url : String,
    val date : String

)
