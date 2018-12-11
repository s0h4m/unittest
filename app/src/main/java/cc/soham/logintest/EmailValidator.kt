package cc.soham.logintest

class EmailValidator {
    companion object {
        var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+".toRegex()
        fun validateEmail(email: String): Boolean = (!email.isNullOrEmpty() && email.matches(emailPattern))
    }
}

