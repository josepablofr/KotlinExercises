package com.example.kotlinexercises.ui

fun caesarCipher(key: Int, message: String): String {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val encryptedMessage = StringBuilder()

    for (letter in message) {
        if (!alphabet.contains(letter)) {
            encryptedMessage.append(letter)
        } else {
            val encryptedIndex = (alphabet.indexOf(letter) + key) % 26
            encryptedMessage.append(alphabet[encryptedIndex])
        }
    }
    return encryptedMessage.toString()
}

fun main(args: Array<String>) {
    val message = "codecademy is awesome!"
    val key = 1
    val encryptedMessage = caesarCipher(key, message)
    println(encryptedMessage)
}