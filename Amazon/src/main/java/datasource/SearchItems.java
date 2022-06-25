package datasource;

import base.CommonAPI;
import org.openqa.selenium.By;
import reporting.TestLogger;

import java.util.List;


public class SearchItems {

    CommonAPI commonAPI = new CommonAPI();
    public void searchItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DataProvider dataProvider = new DataProvider();
        List<String> list = dataProvider.getItemListFromDB();
        for(int i=0; i<list.size(); i++) {
            commonAPI.typeOnWebElementNHitEnter("#twotabsearchtextbox", list.get(i));
            commonAPI.clearInputBox("#twotabsearchtextbox");
            CommonAPI.waitUntilClickAble(By.cssSelector("#twotabsearchtextbox"));
        }
    }
}
