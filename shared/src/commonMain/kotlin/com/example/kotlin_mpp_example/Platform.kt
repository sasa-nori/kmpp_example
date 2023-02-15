package com.example.kotlin_mpp_example

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform