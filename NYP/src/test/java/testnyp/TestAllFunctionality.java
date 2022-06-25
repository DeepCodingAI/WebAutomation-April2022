package testnyp;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AllKindsOfNewsPage;
import reporting.TestLogger;

import java.io.IOException;


public class TestAllFunctionality extends CommonAPI {

    @Test
    public void testNewsFunctionality() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AllKindsOfNewsPage allFunctionalityPage = PageFactory.initElements(driver, AllKindsOfNewsPage.class);
        allFunctionalityPage.runAllTheFeatureTest(driver);
    }
}
