package cc.soham.logintest

import org.amshove.kluent.shouldBeFalse
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.context
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it


object EmailValidatorSpekTests : Spek({
    describe("incorrect inputs") {
        context("blank input") {
            val valid = EmailValidator.validateEmail("")
            it("should be invalid") {
                valid.shouldBeFalse()
            }
        }
    }
})