package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AllKindsOfNewsPage {

    String capturedUrl = "https://nypost.com/";

    SectionMenuPage sectionMenuPage = null;
    LandingPage landingPage = null;

    public void clickOnSectionMenu(WebDriver driver){
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSectionNavBar();
    }

    public void sectionMenu(WebDriver driver){
        try {
            clickOnSectionMenu(driver);
        }catch (Exception ex){
            driver.navigate().to(capturedUrl);
            clickOnSectionMenu(driver);
        }
        sectionMenuPage = PageFactory.initElements(driver, SectionMenuPage.class);
        String metroHeadLineNews = sectionMenuPage.goToMetroPage(driver).getHeadLineNews();
        System.out.println(metroHeadLineNews);
        try{
            clickOnSectionMenu(driver);
        }catch (Exception ex){
            driver.navigate().to(capturedUrl);
            clickOnSectionMenu(driver);
        }
        String sportsHeadLIneNews = sectionMenuPage.goToSportsPage(driver).getHeadLineNews();
        System.out.println(sportsHeadLIneNews);
    }
}
