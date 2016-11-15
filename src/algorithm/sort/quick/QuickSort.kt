package algorithm.sort.quick

import swap

/**
 * Created by jaleel on 14.11.16.
 */
fun <T> quickSort(array: Array<T>, low: Int, high: Int): Array<T> where T: Comparable<T> {
    var arr = array
    var left = low
    var right = high

    val pivot = arr[left + (right - left) / 2]

    while (left < right) {
        while (arr[left] < pivot) {
            left += 1
        }
        while (arr[right] > pivot) {
            right -= 1
        }
        if (left <= right) {
            arr.swap(left, right)
            left += 1
            right -= 1
        }
    }

    // Recursion
    if (low < left) {
        arr = quickSort(arr, low, right)
    }
    if (right < high) {
        arr = quickSort(arr, left, high)
    }

    return arr
}