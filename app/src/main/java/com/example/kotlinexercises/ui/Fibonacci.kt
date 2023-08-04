package com.example.kotlinexercises.ui

fun main() {
    println("dame el número de fibonaccis que quieres")
    val size = readln().toInt()
    val fibonacci = mutableListOf(1,1)

    for(index in 2 .. size) {
        fibonacci.add(fibonacci[index-2] + fibonacci[index-1])
    }
    println(fibonacci)
}


// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 98