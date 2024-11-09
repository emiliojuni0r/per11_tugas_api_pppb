package com.example.per11_tugas_api_cihuy.model

import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("data")

    val data:List<Data>
)
