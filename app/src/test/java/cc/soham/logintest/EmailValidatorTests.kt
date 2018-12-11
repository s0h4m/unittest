package cc.soham.logintest

import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class EmailValidatorTests {
    @Test
    fun blank_isIncorrect() {
        EmailValidator.validateEmail("").shouldBeFalse()
    }

    @Test
    fun empty_isIncorrect() {
        EmailValidator.validateEmail(" ").shouldBeFalse()
    }

    @Test
    fun justString_isIncorrect() {
        EmailValidator.validateEmail("soham").shouldBeFalse()
    }

    @Test
    fun properGmailEmail_isCorrect() {
        EmailValidator.validateEmail("soham@gmail.com").shouldBeTrue()
    }
}