package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.xpath("//input[@id=\"form-input-live-u\"]");
    private By passwordField = By.xpath("//input[@id=\"form-input-live-p\"]");
    private By loginButton = By.xpath("//button[@class=\"btn btn-primary btn-block mb-3\"]");
    private By noInputStatusError = By.id("Need to replace");
    private By randomInputStatusError = By.id("Need to replace");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){

        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){

        driver.findElement(loginButton).click();
    }

    public String getErrorTextNoInput(){
        return driver.findElement(noInputStatusError).getText();
    }

    public String getErrorTextRandomInput(){
        return driver.findElement(randomInputStatusError).getText();
    }
}


