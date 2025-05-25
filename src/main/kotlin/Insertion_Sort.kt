package org.example

fun main(){
    val arr = intArrayOf(10, 5, 6, 7, 2, 1, 0)
    val sortedArray = insertionSort(arr)
    val sortedArray2 = insertionSort2(arr)

    for (i in sortedArray){
        print(" $i ")
    }
}

fun insertionSort(arr : IntArray) : IntArray{
    for(i in 1..<arr.size){
        val key = arr[i]//current element
        var j = i-1 //pre

        while (j>=0 && arr[j]>key){
            arr[j+1] = arr[j]
            j -= 1
        }
        arr[j+1] = key
    }

    return arr
}

fun insertionSort2(arr : IntArray) : IntArray{
    var temp: Int
    for(i in 1..<arr.size){
        for (j in i-1..<i){
            if(arr[i]>arr[j]){
                temp = arr[j]
                arr[j] = arr[i]
                arr[i] = temp
            }else{
                continue
            }
        }
    }

    return arr
}