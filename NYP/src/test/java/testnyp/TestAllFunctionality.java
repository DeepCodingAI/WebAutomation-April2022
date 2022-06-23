package testnyp;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AllKindsOfNewsPage;

import java.io.IOException;


public class TestAllFunctionality extends CommonAPI {

    @Test
    public void testNewsFunctionality() throws IOException, InterruptedException {
        AllKindsOfNewsPage allFunctionalityPage = PageFactory.initElements(driver, AllKindsOfNewsPage.class);
        allFunctionalityPage.runAllTheFeatureTest(driver);
    }
}
