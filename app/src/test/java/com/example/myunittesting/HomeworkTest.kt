package com.example.myunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    @Test
    fun `fib(0), return 0 `() {
        val result = Homework.fib(0)

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `fib(1), return 1 `() {
        val result = Homework.fib(1)

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fib(n), return fib(n-2) + fib(n-1) `() {
        val n = 4
        val result = Homework.fib(n)

        val fibby2 = Homework.fib(n - 2)
        val fibby1 = Homework.fib(n - 1)

        val total = fibby2 + fibby1

        assertThat(result).isEqualTo(total)
    }

    @Test
    fun `"(a * b))", return false `() {
        val result = Homework.checkBraces("(a * b))")

        assertThat(result).isFalse()
    }

    @Test
    fun `"(a * b)", return true `() {
        val result = Homework.checkBraces("(a * b)")

        assertThat(result).isTrue()
    }

}
