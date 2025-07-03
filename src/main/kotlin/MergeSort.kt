package org.example


fun mergeSort(array: IntArray, start: Int, end: Int) { //divide
    if (end <= start) return
    val midPoint = (end + start) / 2
    mergeSort(array, start, midPoint)
    mergeSort(array, midPoint + 1, end)
    merge(array, start, end, midPoint)
}

fun merge(array: IntArray, start: Int, end: Int, midPoint: Int) {

    val leftLength = midPoint - start + 1
    val rightLength = end - midPoint
    val leftArray = IntArray(leftLength)
    val rightArray = IntArray(rightLength)
    var i = 0
    var j = 0
    var k = start

    //fill two arrays
    for (i in 0..<leftLength) {
        leftArray[i] = array[start + i]
    }

    for (j in 0..<rightLength) {
        rightArray[j] = array[midPoint + 1 + j]
    }
    //compare
    //sort
    while (i < leftLength && j < rightLength) {
        if (leftArray[i] < rightArray[j]) {
            array[k] = leftArray[i]
            i++
        } else {
            array[k] = rightArray[j]
            j++
        }
        k++
    }
    //move remain items
    while (i < leftLength) {
        array[k] = leftArray[i]
        i++
        k++
    }

    while (j < rightLength) {
        array[k] = rightArray[j]
        j++
        k++
    }

}