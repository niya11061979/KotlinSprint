package com.example.kotlinsprint.lesson2

fun main() {
    val listGrade = listOf(3, 4, 3, 5)
    val average = listGrade.average()
    println("%.2f".format(average))
}