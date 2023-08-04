package com.example.kotlinexercises.ui

fun main(){
    println("Ingresa el número máximo de la serie")
    val maximum = readln().toInt()
    println("Ingresa de cuánto quieres los saltos")
    val steps = readln().toInt()
    for (index in 1 .. maximum step steps) print(" $index")

}