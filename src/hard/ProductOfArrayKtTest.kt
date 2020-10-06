package hard

import org.junit.Assert
import org.junit.Test

internal class ProductOfArrayKtTest {
    @Test
    fun testProductArray() {
        Assert.assertArrayEquals(intArrayOf(2, 3, 6), productArray(intArrayOf(3, 2, 1)))
        Assert.assertArrayEquals(intArrayOf(120, 60, 40, 30, 24), productArray(intArrayOf(1,2,3,4,5)))
    }

    @Test
    fun testProductArrayNoDivision() {
        Assert.assertArrayEquals(intArrayOf(2, 3, 6), productArrayNoDivision(intArrayOf(3, 2, 1)))
        Assert.assertArrayEquals(intArrayOf(120, 60, 40, 30, 24), productArrayNoDivision(intArrayOf(1,2,3,4,5)))
    }
}