package pages;

import base.CommonAPI;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SectionMenuPage {

    @FindBy(how = How.CSS, using = ".menu-toggle__title")
    public static WebElement sectionMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(2) a")
    public static WebElement metroSectionWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(4) a")
    public static WebElement sportsSectionWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(7) a")
    public static WebElement businessSectionWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(9) a")
    public static WebElement entertainmentSectionWebElement;

    public void clickOnSectionMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sectionMenuWebElement.click();
    }

    public MetroPage goToMetroPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        metroSectionWebElement.click();

        return new MetroPage(driver);
    }
    public SportsPage goToSportsPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sportsSectionWebElement.click();

        return new SportsPage(driver);
    }
    public BusinessPage goToBusinessPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessSectionWebElement.click();

        return new BusinessPage(driver);
    }
    public EntertainmentPage goToEntertainmentPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        entertainmentSectionWebElement.click();

        return new EntertainmentPage(driver);
    }
}
