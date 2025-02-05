package org.example.composemultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform