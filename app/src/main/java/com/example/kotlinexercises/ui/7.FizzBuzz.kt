package com.example.kotlinexercises.ui

fun main(){
    for (i in 1..100) {

        val divisibleByThree = i % 3 == 0
        val divisibleByFive = i % 5 == 0

        if (divisibleByFive && divisibleByThree) {
            println("fizzbuzz")
        } else if (divisibleByThree) {
            println("fizz")
        } else if (divisibleByFive) {
            println("buzz")
        } else {
            println(i)
        }
    }
}


/* Otra forma
fun main() {
    val i = 1
    for (i in 1..100)
        if (i % 15 == 0) {
            println("fizzbuzz")
        } else if (i % 3 == 0) {
            println("fizz")
        } else if (i % 5 == 0) {
            println("buzz")
        }  else ((println(i)))
} */