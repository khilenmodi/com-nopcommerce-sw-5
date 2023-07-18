package com.nopcommerce.hw.testbase;

import com.nopcommerce.hw.propertyreader.PropertyReader;
import com.nopcommerce.hw.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

        String browser = PropertyReader.getInstance().getProperty("browser");

        @BeforeMethod (alwaysRun = true)
    public void setUp(){
            selectBrowser(browser);
        }

        @AfterMethod (alwaysRun = true)
    public void tearDown(){
            closeBrowser();
        }

}
