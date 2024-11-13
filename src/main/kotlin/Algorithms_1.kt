package org.example

//area


fun areaOfParallelogram(h : Double , l : Double) : Double = h*l
fun areaOfTrapezoid(b1:Double,b2:Double,h:Double):Double = 0.5*(b1+b1)*h

fun main(){
    println(areaOfParallelogram(10.0,3.0))
    println(areaOfTrapezoid(5.0,7.0,7.0))
}