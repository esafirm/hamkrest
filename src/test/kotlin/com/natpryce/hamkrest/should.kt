package com.natpryce.hamkrest

import org.junit.Test

class ShouldTest {
    @Test
    fun `it should the same as assertThat`() {
        1 shouldBe 1
        "abc" shouldBe "abc"
        "abc" shouldBe equalTo("abc")

        10 shouldNotBe 1
        1 shouldNotBe 10

        val nullValue = null
        nullValue shouldBe absent()
    }
}