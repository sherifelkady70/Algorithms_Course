package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val array = intArrayOf(5,3,2,6,1)
    mergeSort(array,0,array.size-1)
    array.forEach {
        print(" $it ")
    }
}