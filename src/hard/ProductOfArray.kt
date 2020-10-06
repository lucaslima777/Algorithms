package hard

import jdk.nashorn.tools.ShellFunctions.input
import java.util.*


/**
 * @enterprise Uber
 *
 * Given an array of integers, return a new array such that each element
 * at index i of the new array is the product of all the numbers in the
 * original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected
 * output would be [120, 60, 40, 30, 24]. If our input was
 * [3, 2, 1], the expected output would be [2, 3, 6].
 * */

fun productArray(array: IntArray): IntArray? {
    val product = array.reduce { acc, i -> acc * i }
    return array.map { product / it }.toIntArray()
}

fun productArrayNoDivision(array: IntArray): IntArray {
    val result = LinkedList<Int>()
    var right = 1
    array.reversed().forEach {
        result.push(right)
        right *= it
    }
    var left = 1
    array.forEachIndexed { index, i ->
        result[index] *= left
        left *= i
    }
    return result.toIntArray()
}

fun main() {
    productArray(intArrayOf(3, 2, 1))
}



