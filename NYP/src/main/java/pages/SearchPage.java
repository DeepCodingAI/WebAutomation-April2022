package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SearchPage {

    @FindBy(how = How.CSS,using = ".site-header__search-toggle")
    public static WebElement searchIconWebElement;

    @FindBy(how = How.CSS,using = "input#search-input-header.search__input")
    public static WebElement searchInputFieldWebElement;

    @FindBy(how = How.CSS,using = "button.search__submit")
    public static WebElement searchSubmitButtonWebElement;

    public void searchIcon(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchIconWebElement.click();
    }

    public void typeOnSearchField(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInputFieldWebElement.sendKeys(value, Keys.ENTER);
    }
    public void clickOnSubmitButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchSubmitButtonWebElement.click();
    }
    public void searchIconClickNEnterNewsNSubmit(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnSearchField("covid-19");
        //clickOnSubmitButton();
    }
    public void clickOnSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchSubmitButtonWebElement.click();
    }
}
