package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class LandingPage {

    @FindBy(how = How.CSS, using = ".menu-toggle__title")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS, using = ".site-header__search-toggle")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = "#nypost-membership-header")
    public static WebElement logInWebElement;

    @FindBy(how = How.CSS, using = ".input-container")
    public static WebElement logInSubmitWebElement;

    public void clickOnSectionNavBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sectionNavBarWebElement.click();
    }

    public void clickOnSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchWebElement.click();
    }

    public void clickOnLogIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInWebElement.click();
    }

    public void clickOnLogInSubmit(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInSubmitWebElement.click();
    }

}
