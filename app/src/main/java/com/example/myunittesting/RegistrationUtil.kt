package com.example.myunittesting

object RegistrationUtil {

    /**
     *  The input is not valid if
     *  - username/password is empty
     *  - username is already taken
     *  - confirmed password is not match with password
     *  - password length less than 8
     */

    private val registeredUsername = listOf("Peter", "dimas", "Aldi")

    fun validateUserRegistration(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isBlank() || password.isBlank()) {
            return false
        }

        if (username in registeredUsername) {
            return false
        }

        if (confirmedPassword != password) {
            return false
        }
        if (password.length < 8) {
            return false
        }

        return true
    }
}
