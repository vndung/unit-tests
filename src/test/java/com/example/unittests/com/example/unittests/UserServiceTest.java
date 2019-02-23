package com.example.unittests.com.example.unittests;

import com.example.unittests.UserService;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserServiceTest {

    private UserService userService = new UserService();

    @Test
    public void testAuthenticateWithInvalidCredentialsShouldFail() {
        boolean result = userService.authenticate("myname", "mypass");

        assertFalse(result);
    }

    @Test
    public void testAuthenticateWithValidCredentialsShouldSuccess() {
        boolean result = userService.authenticate("vnd", "admin");

        assertTrue(result);
    }
}
