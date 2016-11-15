/**
 * Created by jaleel on 12.11.16.
 */

fun <T> Array<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}
