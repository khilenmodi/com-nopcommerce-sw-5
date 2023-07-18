package com.nopcommerce.hw.pages;

import com.nopcommerce.hw.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Electronics extends Utility {
   /* String Electronics;
    String Menu;
    public void selectMenu(String menu){
        this.Menu = menu;
        clickOnElement(By.xpath(menu));
    }
    public void check1(){
        Menu = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']";
        selectMenu(Electronics);
    }*/


    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics;
    //  By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhone;
    //  By cellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellPhone;
    //  By verifyTextCellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement clickOnListViewTab;
    //   By clickOnListViewTab = By.xpath("//a[contains(text(),'List')]");
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement clickONNokiaLumia1020;
    //   By clickONNokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement verifyTextNokiaLumia1020;
    //   By verifyTextNokiaLumia1020 = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement verifyThePrice;
    //    By verifyThePrice = By.id("price-value-20");
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement changedTheQty;
    // By changedTheQty = By.id("product_enteredQuantity_20");
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCartBtn;
    //  By addToCartBtn = By.id("add-to-cart-button-20");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyTheMessageTheProductHasBeenAddedToYourCart;
    //  By verifyTheMessageTheProductHasBeenAddedToYourCart = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement clickOnCross;
    //  By clickOnCross = By.xpath("//span[@title='Close']");
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement mouseHoverOnShoppingCart;
    // By mouseHoverOnShoppingCart = By.xpath("//span[@class='cart-label']");
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement enterGoToCart;
    // By enterGoToCart = By.xpath("//button[normalize-space()='Go to cart']");
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement verifyMessageShoppingCart;
    //   By verifyMessageShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']")
    WebElement verifyQty2;
    //   By verifyQty2 = By.xpath("//td[@class='quantity']");
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$698.00')]")
    WebElement verifyTheTotal;
    //  By verifyTheTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickTheCheckBoxOfTermsAndCondition;
    //  By clickTheCheckBoxOfTermsAndCondition = By.xpath("//input[@id='termsofservice']");
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement clickOnCheckout;
    //   By clickOnCheckout = By.id("checkout");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTheTextWelcomePleaseSignIN;
    //    By verifyTheTextWelcomePleaseSignIN = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement selectRegister;
    //  By selectRegister = By.xpath("//button[contains(text(),'Register')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyTheTextRegister;
    //  By verifyTheTextRegister = By.xpath("//h1[contains(text(),'Register')]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement clickOnGender;
    //   By clickOnGender = By.xpath("//input[@id='gender-male']");
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement enterFirstName;
    //   By enterFirstName = By.id("FirstName");
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement enterLastName;
    //  By enterLastName = By.id("LastName");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmailAddress;
    // By enterEmailAddress = By.id("Email");
    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;
    //  By enterPassword = By.id("Password");
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement enterConfirmPassword;
    // By enterConfirmPassword = By.id("ConfirmPassword");
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickOnRegister;
    // By clickOnRegister = By.id("register-button");
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyTextRegistrationCompleted;
    //   By verifyTextRegistrationCompleted = By.xpath("//div[contains(text(),'Your registration completed')]");
    @CacheLookup
    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    WebElement clickOnContinue;
    //   By clickOnContinue = By.xpath("//a[@class='button-1 register-continue-button']");
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement verifyTheTextShoppingCart;
    //   By verifyTheTextShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement clickOnTermsAndCondition;
    //  By clickOnTermsAndCondition = By.id("termsofservice");
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement pressCheckout;
    //  By pressCheckout = By.id("checkout");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;
    //  By firstName = By.id("BillingNewAddress_FirstName");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement secondName;
    //  By secondName = By.id("BillingNewAddress_LastName");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailAddress;
    //  By emailAddress = By.id("BillingNewAddress_Email");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    //   By country = By.id("BillingNewAddress_CountryId");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    // By city = By.id("BillingNewAddress_City");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1;
    //  By address1 = By.id("BillingNewAddress_Address1");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    //  By postCode = By.id("BillingNewAddress_ZipPostalCode");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    //  By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement selectContinue;
    //  By selectContinue = By.xpath("//button[@onclick='Billing.save()']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement select2ndDayAir;
    //  By select2ndDayAir = By.xpath("//input[@id='shippingoption_2']");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement selectCon;
    //  By selectCon = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickCreditCard;
    //  By clickCreditCard = By.xpath("//input[@id='paymentmethod_1']");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement clickCon;
    //   By clickCon = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectCreditCard;
    // By selectCreditCard = By.id("CreditCardType");
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    //  By cardHolderName = By.id("CardholderName");
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    //  By cardNumber = By.id("CardNumber");
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expirationMonth;
    // By expirationMonth = By.id("ExpireMonth");
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expirationYear;
    // By expirationYear = By.id("ExpireYear");
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    // By cardCode = By.id("CardCode");

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement cardContinueButton;
    //    By cardContinueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement verifyCreditCard;
    //  By verifyCreditCard = By.xpath("//span[normalize-space()='Credit Card']");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='2nd Day Air']")
    WebElement verify2ndDayAirText;
    //   By verify2ndDayAirText = By.xpath("//span[normalize-space()='2nd Day Air']");

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement verifyProductSubTotal;
    //   By verifyProductSubTotal = By.xpath("//span[@class='product-subtotal']");

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement clickingConfirm;
    //   By clickingConfirm = By.xpath("//button[normalize-space()='Confirm']");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyTextThankYou;
    //  By verifyTextThankYou = By.xpath("//h1[contains(text(),'Thank you')]");

    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement veryTextOrderSuccessfully;
    //   By veryTextOrderSuccessfully = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueClick;
    //  By continueClick = By.xpath("//button[normalize-space()='Continue']");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmailId;
    //   By enterEmailId = By.id("Email");
    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPass;
    //  By enterPass = By.id("Password");

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logIn;
    //   By logIn = By.xpath("//button[normalize-space()='Log in']");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement clickLogIn;

    // By clickLogIn = By.xpath("//a[contains(text(),'Log in')]");

    public void clickOnElectronicMenu(){
        clickOnElement(electronics);
    }

    public void setCellPhone() {
        mouseHoverToElementAndClick((WebElement) cellPhone);
    }

    public String setVerifyTextCellPhone() {
        return getTextFromElement(verifyTextCellPhone);
    }

    public void setClickOnListViewTab() {
        clickOnElement(clickOnListViewTab);
    }

    public void setClickONNokiaLumia1020() {
        clickOnElement(clickONNokiaLumia1020);
    }

    public String setVerifyTextNokiaLumia1020() {
        return getTextFromElement(verifyTextNokiaLumia1020);
    }

    public String setVerifyThePrice() {
        return getTextFromElement(verifyThePrice);
    }

    public void setChangedTheQty() {
        clickOnElement(changedTheQty);
        clearTextOfElement(changedTheQty);
        sendTextToElement(changedTheQty, "2");
    }

    public void setAddToCartBtn() {
        clickOnElement(addToCartBtn);
    }

    public String setVerifyTheMessageTheProductHasBeenAddedToYourCart() {
        return getTextFromElement(verifyTheMessageTheProductHasBeenAddedToYourCart);
    }

    public void setClickOnCross() {
        clickOnElement(clickOnCross);
    }

    public void setMouseHoverOnShoppingCart() {
        mouseHoverToElement((WebElement) mouseHoverOnShoppingCart);
    }

    public void setEnterGoToCart() {
        clickOnElement(enterGoToCart);
    }

    public String setVerifyMessageShoppingCart() {
        return getTextFromElement(verifyMessageShoppingCart);
    }

    public String setVerifyQty2() {
        return getTextFromElement(verifyQty2);
    }

    public String setVerifyTheTotal() {
        return getTextFromElement(verifyTheTotal);
    }

    public void setClickTheCheckBoxOfTermsAndCondition() {
        clickOnElement(clickTheCheckBoxOfTermsAndCondition);
    }

    public void setClickOnCheckout() {
        clickOnElement(clickOnCheckout);
    }

    public String setVerifyTheTextWelcomePleaseSignIN() {
        return getTextFromElement(verifyTheTextWelcomePleaseSignIN);
    }

    public void setSelectRegister() {
        clickOnElement(selectRegister);
    }

    public String setVerifyTheTextRegister() {
        return getTextFromElement(verifyTheTextRegister);
    }

    public void setClickOnGender() {
        clickOnElement(clickOnGender);
    }

    public void setEnterFirstName(String first) {
        sendTextToElement(enterFirstName, first);
    }

    public void setEnterLastName(String second) {
        sendTextToElement(enterLastName, second);
    }

    public void setEnterEmailAddress(String email) {
        sendTextToElement(enterEmailAddress, email);
    }

    public void setEnterPassword(String pass) {
        sendTextToElement(enterPassword, pass);
    }

    public void setEnterConfirmPassword(String pass1) {
        sendTextToElement(enterConfirmPassword, pass1);
    }

    public void setClickOnRegister() {
        clickOnElement(clickOnRegister);
    }

    public String setVerifyTextRegistrationCompleted() {
        return getTextFromElement(verifyTextRegistrationCompleted);
    }

    public void setClickOnContinue() {
        clickOnElement(clickOnContinue);
    }

    public String setVerifyTheTextShoppingCart() {
        return getTextFromElement(verifyTheTextShoppingCart);
    }

    public void setClickOnTermsAndCondition() {
        clickOnElement(clickOnTermsAndCondition);
    }

    public void setPressCheckout() {
        clickOnElement(pressCheckout);
    }

    public void setFirstName(String name) {
        sendTextToElement(firstName,name);
    }

    public void setSecondName(String Name1){
        sendTextToElement(secondName,Name1);
    }
    public void setEmailAddress(String email){
        sendTextToElement(emailAddress,email);
    }
    public void setCountry(String val){
        selectByValueFromDropDown(country, val);
    }
    public  void setCity(String c1){
        sendTextToElement(city,c1);
    }
    public void setAddress1( String Add){
        sendTextToElement(address1,Add);

    }
    public void setPostCode(String PCode){
        sendTextToElement(postCode,PCode);
    }
    public void setPhoneNumber(String Num){
        sendTextToElement(phoneNumber, Num);
    }
    public void setSelectContinue() {
        clickOnElement(selectContinue);
    }

    public void setSelect2ndDayAir() {
        clickOnElement(select2ndDayAir);
    }

    public void enterClickCon() {
        clickOnElement(selectCon);
    }

    public void setClickCreditCard() {
        clickOnElement(clickCreditCard);
    }

    public void setClickCon() {
        clickOnElement(clickCon);
    }

    public void setSelectCreditCard(String Card){
        selectByVisibleTextFromDropDown(selectCreditCard,Card);
    }
    public void setCardHolderName(String CName){
        sendTextToElement(cardHolderName,CName);
    }
    public void setCardNumber(String CNum){
        sendTextToElement(cardNumber,CNum);
    }
    public void setExpirationMonth(String CMon){
        selectByValueFromDropDown(expirationMonth,CMon);
    }
    public void setExpirationYear(String CYear){
        selectByValueFromDropDown(expirationYear,CYear);
    }
    public void setCardCode(String CCode){
        sendTextToElement(cardCode, CCode);
    }
    public void setCardContinueButton() {
        clickOnElement(cardContinueButton);
    }

    public String setVerifyCreditCard() {
        return getTextFromElement(verifyCreditCard);
    }

    public String setVerify2ndDayAirText() {
        return getTextFromElement(verify2ndDayAirText);
    }

    public String setVerifyingProductSubTotal() {
        return getTextFromElement(verifyProductSubTotal);
    }

    public void setClickingConfirm() {
        clickOnElement(clickingConfirm);
    }

    public String setVerifyTextThankYou() {
        return getTextFromElement(verifyTextThankYou);
    }

    public String setVeryTextOrderSuccessfully() {
        return getTextFromElement(veryTextOrderSuccessfully);
    }

    public void setContinueClick() {
        clickOnElement(continueClick);
    }

    public void setEnterEmailId(String email1) {
        sendTextToElement(enterEmailId, email1);
    }

    public void setEnterPass(String pass2) {
        sendTextToElement(enterPass, pass2);
    }

    public void setLogIn() {
        clickOnElement(logIn);
    }

    public void setClickLogIn() {
        clickOnElement(clickLogIn);
    }


}