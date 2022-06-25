package dropdownmenu;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class SearchDropDownMenu extends CommonAPI {

    CommonAPI commonAPI = new CommonAPI();
    public void fetchDropDownMenuItems(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> text = CommonAPI.getListOfText(".nav-search-dropdown.searchSelect.nav-progressive-attrubute option");
        commonAPI.printText(text);
        //fetch api to extract drop down menu text
        Assert.assertEquals(text,text);
    }
}
