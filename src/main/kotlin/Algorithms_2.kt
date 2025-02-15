package org.example

import java.lang.Math.sqrt
import java.sql.DriverManager.println


//sigma notation - standard deviation



fun main(){
    val arr = intArrayOf(1,2,3)
    println(calculateStandardDeviation(arr).toString())
}


fun calculateStandardDeviation(arr: IntArray): Double {
    var sum = 0.0
    val length = arr.size.toDouble()
    var sigmaNotation = 0.0
    for (i in arr) {
        sum += i
    }
    val avg = sum / arr.size
    for (i in arr) {
        sigmaNotation += ((i - avg) * (i - avg))
    }
    val standardDeviation = sqrt((sigmaNotation / length))
    return standardDeviation
}