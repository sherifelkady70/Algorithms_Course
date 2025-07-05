package org.example

fun insertionSort(array : IntArray)  {
    for(i in 1..<array.size){
        val key = array[i]
        for(j in i-1 downTo 0){
            if(array[j]>key){
                array[j+1] = array[j]
                array[j] = key
            }
        }
    }
}

fun insertionSort2(array: IntArray) {
    for (i in 1..<array.size){
        val key = array[i]
        var j  = i-1
        while (j>=0 && array[j]>key){
            array[j+1] = array[j]
            j--
        }
        array[j+1] = key
    }
}