package com.example.kotlinexercises.ui
import kotlin.math.sign

fun main(){
    println("Ingresa la palabra o frase a analizar")
    val word = readln()
    val wordWithoutSpace = word.filter { !it.isWhitespace() }

    val countChars: MutableMap<Char, Int> = wordWithoutSpace.groupingBy { it }.eachCount() as MutableMap<Char, Int>
    println(countChars)
    val filteredMap = countChars.count { (key, value) -> value % 2 != 0 }
    if (filteredMap <= 1 ) println("TRUE palíndromo") else println("FALSE palíndromo")
    }
