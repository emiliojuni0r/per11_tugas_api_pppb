package com.example.per11_tugas_api_cihuy.network

import com.example.per11_tugas_api_cihuy.model.Data
import com.example.per11_tugas_api_cihuy.model.Users
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users?page=2") // Assuming this is the correct endpoint.
    fun getallusers(): Call<Users>
}