package com.natpryce.hamkrest

import com.natpryce.hamkrest.assertion.assertThat

infix fun <T> T.shouldBe(value: Any) = should(equalTo(value))
infix fun <T> T.shouldNotBe(value: Any) = should(equalTo(value).not())
infix fun <T> T.shouldBe(matcher: Matcher<T>) = should(matcher)
infix fun <T> T.shouldNotBe(matcher: Matcher<T>) = should(matcher.not())

private infix fun <T> T.should(matcher: Matcher<T>) = assertThat(this, matcher)
