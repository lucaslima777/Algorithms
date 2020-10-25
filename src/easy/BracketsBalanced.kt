package easy

import java.util.*

/**
 * @enterprise Facebook
 *
 * Given a string of round, curly, and square open and closing brackets
 * return whether the brackets are balanced (well-formed).
 *
 * For example, given the string "([])[]({})", you should return true.
 * Given the string "([)]" or "((()", you should return false.
 * */

fun balancedBrackets(input: String, brackets: Map<Char, Char> = mapOf(']' to '[', ')' to '(', '}' to '{')) =
    Stack<Char>().apply {
        require(input.all { it in brackets.flatMap { (k, v) -> listOf(k, v) } })

        input.forEach {
            when {
                it in brackets.values -> push(it)
                isEmpty() || pop() != brackets[it] -> return false
            }
        }
    }.isEmpty()

fun main() {
    balancedBrackets(input = "([])[]({})")
}