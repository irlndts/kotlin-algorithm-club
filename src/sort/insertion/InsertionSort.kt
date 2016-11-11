package sort.insertion

/**
 * Created by jaleel on 11.11.16.
 */

fun <T> insertionSort(array: Array<T>, isOrderedBefore: (T, T) -> Boolean): Array<T> {
    if (array.size <= 1) {
        return array
    }

    val arr = array
    for (x in 1..arr.size-1) {
        var y = x
        val temp = arr[y]
        while (y > 0 && isOrderedBefore(temp, arr[y-1])) {
            arr[y] = arr[y - 1]
            y -= 1
        }
        arr[y] = temp
    }
    return arr
}