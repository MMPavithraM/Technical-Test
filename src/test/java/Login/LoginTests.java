package Login;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testNoInputLogin(){

        loginPage.setUsername(" ");
        loginPage.setPassword(" ");
        loginPage.clickLoginButton();

        assertTrue(loginPage.getErrorTextNoInput()
            .contains("Enter Username & password"),
               "Error status is incorrect");
    }

    @Test
    public void testInvalidLogin(){

        loginPage.setUsername("Jane");
        loginPage.setPassword("123456");
        loginPage.clickLoginButton();

        assertTrue(loginPage.getErrorTextRandomInput()
             .contains("Invalid username and password"),
                        "Error status is incorrect");
    }

}
