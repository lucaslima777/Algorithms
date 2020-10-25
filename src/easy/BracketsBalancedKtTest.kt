package easy

import org.junit.Assert.*
import org.junit.Test

internal class BracketsBalancedKtTest {

    @Test
    fun testBalancedBrackets() {
        assertTrue(balancedBrackets("()[]{}(([])){[()][]}"))
        assertFalse(balancedBrackets("())[]{}"))
        assertFalse(balancedBrackets("[(])"))
    }
}