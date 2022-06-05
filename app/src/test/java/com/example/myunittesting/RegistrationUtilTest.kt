package com.example.myunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    /**
     *  The input is not valid if
     *  - username/password is empty
     *  - username is already taken
     *  - confirmed password is not match with password
     *  - password length less than 8
     */

    @Test
    fun `empty username, must return false`() {

        //the code
        val result = RegistrationUtil.validateUserRegistration(
            "", "123", "123"
        )
        //im expecting:
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password, must return false`() {

        //the code
        val result = RegistrationUtil.validateUserRegistration(
            "asdas", "", ""
        )
        //im expecting:
        assertThat(result).isFalse()
    }

    @Test
    fun `username is already taken, must return false`() {
        //the code
        val result = RegistrationUtil.validateUserRegistration(
            "Peter", "123", "123"
        )
        //im expecting:
        assertThat(result).isFalse()
    }

    @Test
    fun `confirmed password is not match with password, must return false`() {
        //the code
        val result = RegistrationUtil.validateUserRegistration(
            "Peter", "12", "123"
        )
        //im expecting:
        assertThat(result).isFalse()
    }

    @Test
    fun `password length less than 5, must return false`() {
        //the code
        val result = RegistrationUtil.validateUserRegistration(
            "Peter", "123", "123"
        )
        //im expecting:
        assertThat(result).isFalse()
    }

    @Test
    fun `input is valid, must return true`() {
        //the code
        val result = RegistrationUtil.validateUserRegistration(
            "Udin", "12345678", "12345678"
        )
        //im expecting:
        assertThat(result).isTrue()
    }

}
