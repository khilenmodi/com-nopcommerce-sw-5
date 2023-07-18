package com.nopcommerce.hw.testsuite;

import com.nopcommerce.hw.pages.ComputerMenu;
import com.nopcommerce.hw.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    ComputerMenu computerMenu;
        @BeforeMethod (alwaysRun = true)
        public void inIT() {
                computerMenu = new ComputerMenu();
        }

    @Test (groups = {"Sanity", "smoke", "regression"})
    public void verifyTheProductWillArrangeInDescendingOrder(){
        computerMenu.clickOnComputerMenu();
        computerMenu.clickOnDesktopMenu();
        computerMenu.setSortByNameZToA();
        String actualText = computerMenu.getMessage();
        String expectedText = "Name: Z to A";
        Assert.assertEquals(actualText,expectedText,"Name: Z to A");


    }

        @Test (groups = {"smoke", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException{
            computerMenu.clickOnComputerMenu();
            computerMenu.clickOnDesktopMenu();
            computerMenu.setSortByNameAtoZ("5");
            Thread.sleep(2000);
            computerMenu.setAddTOCartButton();
            String actualText = "Build your own computer";
            String expectedText = computerMenu.getBuildYourOwnComputerText();
            Assert.assertEquals(actualText,expectedText,"Build your own computer");
            computerMenu.setSelectGHzIntelPentiumDualCoreE2200("1");
            Thread.sleep(2000);
            computerMenu.setSelect8GBRAM("5");
            computerMenu.setSelectHDD400GB();
            computerMenu.setSelectVistaPremium();
            computerMenu.setCheckBoxOfMicroSoftOffice();
            computerMenu.setCheckBoxOfMicroSoftOffice();
            computerMenu.setCheckBoxOfTotalCommander();
            Thread.sleep(3000);
            String actualText1 = computerMenu.setSelectPriceValue1475();
            String expectedText1 = "$1,475.00";
            Assert.assertEquals(actualText1,expectedText1,"$1,475.00");
            computerMenu.setClickOnAddToCartButton();
            String actualMessage = computerMenu.setVerifyTheMessageTheProductHasBeenAddedToYourCart();
            String expectedMessage = "The product has been added to your shopping cart";
            Assert.assertEquals(actualMessage,expectedMessage,"The product has been added to your shopping cart");
            computerMenu.setClickOnCross();
            Thread.sleep(3000);
            computerMenu.setMouseHoverOnShoppingCart();
            computerMenu.setEnterGoToCart();
            String actualTextMessage = computerMenu.setVerifyMessageShoppingCart();
            String expectedTextMessage = "Shopping cart";
            Assert.assertEquals(actualTextMessage,expectedTextMessage,"Shopping cart message not matched");
            computerMenu.setChangeQty("2");
            computerMenu.setUpdateCart();
            String actualTextMessage1 = computerMenu.setVerifyTotal$2950();
            String expectedTextMessage1 = "$2,950.00";
            Assert.assertEquals(actualTextMessage1,expectedTextMessage1,"$2,950.00");
            computerMenu.setClickOnTermsAndCondition();
            computerMenu.setPressCheckout();
            String actualMessage2 = computerMenu.setVerifyTheWelcomePleaseSignInText();
            String expectedMessage2 = "Welcome, Please Sign In!";
            Assert.assertEquals(actualMessage2,expectedMessage2,"checkout welcome message not matched");
            computerMenu.setCheckOutAsGuest();
            computerMenu.setFirstName("khilen");
            computerMenu.setSecondName("Modi");
            computerMenu.setEmailAddress("khilenmodi1234@yahoo.com");
            computerMenu.setCountry("233");
            computerMenu.setCity("Hertfordshire");
            computerMenu.setAddress1("20, Tudor avenue");
            computerMenu.setPostCode("WD6 5BA");
            computerMenu.setPhoneNumber("07315672406");
            computerMenu.setSelectContinue();
            computerMenu.setNextDayAir();
            computerMenu.setClickContinue();
            computerMenu.setClickCreditCard();
            computerMenu.setClickCon();
            computerMenu.setSelectCreditCard("Master card");
            computerMenu.setCardHolderName("khilen");
            computerMenu.setCardNumber("5354568052254288");
            computerMenu.setExpirationMonth("5");
            computerMenu.setExpirationYear("2026");
            computerMenu.setCardCode("543");
            computerMenu.setCardContinueButton();
            String actualMessage3 = computerMenu.setVerifyCreditCard();
            String expectedMessage3 = "Credit Card";
            Assert.assertEquals(actualMessage3,expectedMessage3, "credit card message not displayed");
            String actualText2 = computerMenu.setVerifyNextDayAir();
            String ExpectedText2 = "Next Day Air";
            Assert.assertEquals(actualText2,ExpectedText2,"Next day air message not displayed");
            String actualText3 = computerMenu.setVerifyTotal();
            String expectedText3 = "$2,950.00";
            Assert.assertEquals(actualText3,expectedText3,"$2,950.00");
            computerMenu.setClickConfirm();
            String actualMess = computerMenu.setVerifyTextThankYou();
            String expectedMess = "Thank you";
            Assert.assertEquals(actualMess,expectedMess,"Thank you message not displayed");
            String actText = computerMenu.setVeryTextOrderSuccessfully();
            String expText = "Your order has been successfully processed!";
            Assert.assertEquals(actText,expText,"Your order has not been successfully processed!");
            computerMenu.setContinueClick();
            String actMessage = computerMenu.setVerifyWelcome();
            String expMessage = "Welcome to our store";
            Assert.assertEquals(actMessage,expMessage,"Welcome to our store message not displayed");
        }

}
