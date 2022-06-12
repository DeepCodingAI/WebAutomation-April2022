package testnyp;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AllKindsOfNewsPage;


public class TestAllFunctionality extends CommonAPI {

    @Test
    public void testNewsFunctionality(){
        AllKindsOfNewsPage allFunctionalityPage = PageFactory.initElements(driver, AllKindsOfNewsPage.class);
        allFunctionalityPage.sectionMenu(driver);
    }
}
