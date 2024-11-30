package org.example

import kotlin.math.sqrt

//correlation

fun main() {
    val arrX = intArrayOf(1, 2, 3, 4, 5, 6)
    val arrY = intArrayOf(1, 2, 3, 4, 5, 6)
    println(calculateCorrelation(arrX, arrY))
}

fun calculateCorrelation(arrX: IntArray, arrY: IntArray) : Int {
    var topEquation = 0
    var downEquationOne = 0
    var downEquationTwo = 0
    val nOfX = arrX.size
    val nOfY = arrY.size
    var sumX = 0
    var sumY = 0

    for (i in arrX) {
        sumX += i
    }
    val avgX = sumX / nOfX
    for (i in arrY) {
        sumY += i
    }
    val avgY = sumY / nOfY

    for (i in 0..<nOfX) {
        topEquation += (arrX[i] - avgX) * (arrY[i] - avgY)
    }
    for (i in arrX) {
        downEquationOne += (i - avgX) * (i - avgX)
    }
    for (i in arrY) {
        downEquationTwo += (i - avgY) * (i - avgY)
    }
    val downEquation = sqrt(((downEquationOne * downEquationTwo).toDouble())).toInt()
    val r = topEquation / downEquation

    return r
}