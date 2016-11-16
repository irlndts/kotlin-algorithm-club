package algorithm.sort.bubble

import swap

/**
 * Created by jaleel on 11.11.16.
 */

fun <T> bubbleSort(array: Array<T>): Array<T> where T : Comparable<T> {
    if (array.size <= 1) {
        return array
    }
    val arr = array
    for (i in 0..arr.size-1) {
        for (j in 0..arr.size-i-2) {
            if (arr[j] > arr[j+1]) {
                arr.swap(j,j+1)
            }
        }
    }
    return arr
}
