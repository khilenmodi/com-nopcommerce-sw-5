package com.nopcommerce.hw.pages;

import com.nopcommerce.hw.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuClass extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    List<WebElement> topMenuTab;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerLink;

    @FindBy(xpath="//h1[contains(text(),'Computers')]")
    WebElement computerText;

// By topMenuTab = "//ul[@class='top-menu notmobile']/li");
// By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");



    public void clickOnComputer(){
        clickOnElement(computerLink);
    }


    /*public String selectMenu() {
         return  verifyThatElementIsDisplayed(topMenuTab);
    }*/

    public String getToVerifyText(){
        return getTextFromElement(computerText);
    }

    // String expectedPage = "https://demo.nopcommerce.com/computers";
    //  String actualPage =   topMenu.currentUrl();
    //  Assert.assertEquals(expectedPage,actualPage, "Does not navigate");

}