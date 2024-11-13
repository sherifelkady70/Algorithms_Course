package org.example

import kotlin.math.sqrt

//sigma notation - standard deviation



fun main(){
    val arr = intArrayOf(5,6,7,8,9,10)
    println(calculateStandardDeviation(arr))
}


fun calculateStandardDeviation(arr:IntArray) : Double{
    var sum = 0.0
    val length = arr.size.toDouble()
    var sigmaNotation = 0.0
    //calculate avg of array indexes
    for(i in arr){
        sum+=i
    }
    val avg = sum / arr.size
    for(i in arr){
        sigmaNotation+=((i-avg)*(i-avg))
    }
    val standardDeviation = sqrt((sigmaNotation / length))
    return standardDeviation
}