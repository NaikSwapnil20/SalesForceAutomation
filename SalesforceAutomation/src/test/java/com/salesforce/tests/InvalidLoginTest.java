package com.salesforce.tests;

import com.salesforce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test(priority = 2, description = "Verify error message with invalid credentials")
    public void testInvalidLogin() {
        try {
            LoginPage loginPage = new LoginPage(driver);
            
            String invalidUser = "invalid_user_" + System.currentTimeMillis() + "@test.com";
            String invalidPass = "WrongPass123";

            loginPage.doLogin(invalidUser, invalidPass);

            String actualError = loginPage.getErrorMessage();
            
            // Allow for localized error messages, or just check non-null
            Assert.assertNotNull(actualError, "Error message should be displayed for invalid login");
            Assert.assertTrue(actualError.contains("check your username and password") || actualError.contains("Please enter your password"), 
                "Error message verification failed. Actual: " + actualError);
            
            System.out.println("Invalid login test passed. Error verified: " + actualError);

        } catch (Exception e) {
            Assert.fail("Invalid Login Test failed due to exception: " + e.getMessage());
        }
    }
}
