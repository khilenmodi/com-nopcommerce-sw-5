package com.nopcommerce.hw.testsuite;

import com.nopcommerce.hw.pages.MenuClass;
import com.nopcommerce.hw.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

    MenuClass topMenu;

   /* public void selectMenu(String menu) {
        clickOnElement(topMenu,menu);
    }*/


    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        topMenu = new MenuClass();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void verifyPageNavigation() {
      //  topMenu.selectMenu("Computer");
        topMenu.clickOnComputer();


        selectmenu("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
        String expectedText = "Computers";
        String actualText = topMenu.getToVerifyText();
        Assert.assertEquals("Text not verified", actualText, expectedText);
    }
}
