package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class LogInPage {
    @FindBy(how = How.CSS, using = "#email")
    public static WebElement emailFieldWebElement;

    @FindBy(how = How.CSS, using = "#password")
    public static WebElement passwordFieldWebElement;

    @FindBy(how = How.XPATH, using = "//input[@data-test-id='login-submit']")
    public static WebElement logInButtonWebElement;

    public WebElement getEmailFieldWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return emailFieldWebElement;
    }
    public WebElement getPasswordFieldWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return passwordFieldWebElement;
    }
    public WebElement getLogInButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return logInButtonWebElement;
    }

    public void enterEmailAddress(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEmailFieldWebElement().sendKeys(value);
    }
    public void enterPassword(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPasswordFieldWebElement().sendKeys(value, Keys.ENTER);
    }
    public void clickOnLogInSubmitButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLogInButtonWebElement().click();
    }
}
