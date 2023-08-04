package com.example.kotlinexercises.ui

import androidx.compose.ui.text.decapitalize

fun main() {
    println("Enter the desired text")
    val text = readln().toString()
    println("Enter argument 'upper', 'lower', 'snake' or 'camel' ")
    val argument = readln().toString()
    val snakecase = text.toSnakeCase()
    when (argument) {
        "upper" -> println(text.uppercase())
        "lower" -> println(text.lowercase())
        "snake" -> println(snakecase)
        "camel" -> println("camel")
        else -> println("error")
    }
}

fun String.toSnakeCase(): String {
    val pattern = "(?<=.)[A-Z]".toRegex()
    return this.replace(pattern, "_$0").lowercase()
}

// fun toCamelCase(){}

