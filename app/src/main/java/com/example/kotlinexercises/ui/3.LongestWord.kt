package com.example.kotlinexercises.ui

fun main(){
    println("Write your sentence")
    val sentence = readln()
    val longestWord = longestWord(sentence)
    println("La longest word es $longestWord y tiene de largo ${longestWord.length} caracteres")
}

fun longestWord(sentence: String): String {
    val words = sentence.split("")
    var longestWord = words[0]
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }
    return longestWord
}