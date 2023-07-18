package com.nopcommerce.hw.pages;

import com.nopcommerce.hw.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerMenu extends Utility {
   /* String Menu;
    String computer;
    public void selectMenu(String menu){
        this.Menu = menu;
        clickOnElement(By.xpath(menu));
    }
    public void check(){
        Menu = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']";
        selectMenu(computer);
    }*/
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerMenu1;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktop;
   // By desktop = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    @CacheLookup
    @FindBy( xpath = "//option[contains(text(),'Name: Z to A')]")
    WebElement sortByNameZToA;
   // By sortByNameZToA = By.xpath("//option[contains(text(),'Name: Z to A')]");
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByNameAtoZ;
   // By sortByNameAtoZ = By.xpath("//select[@id='products-orderby']");
    @CacheLookup
    @FindBy( xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addTOCartButton;
  // By addTOCartButton = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    @CacheLookup
    @FindBy( xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    //By buildYourOwnComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement selectGHzIntelPentiumDualCoreE2200;
   // By selectGHzIntelPentiumDualCoreE2200 = By.id("product_attribute_1");
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement select8GBRAM;
   // By select8GBRAM = By.id("product_attribute_2");
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement selectHDD400GB;
  //  By selectHDD400GB = By.xpath("//input[@id='product_attribute_3_7']");
    @CacheLookup
    @FindBy( id = "product_attribute_4_9")
    WebElement selectVistaPremium;
   // By selectVistaPremium = By.id("product_attribute_4_9");
    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement checkBoxOfMicroSoftOffice;
   // By checkBoxOfMicroSoftOffice = By.id("product_attribute_5_10");
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement checkBoxOfTotalCommander;
   // By checkBoxOfTotalCommander = By.id("product_attribute_5_12");
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement clickOnAddToCartButton;
   // By clickOnAddToCartButton = By.id("add-to-cart-button-1");
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement selectPriceValue1475;
  //  By selectPriceValue1475 = By.xpath("//span[@id='price-value-1']");
    @CacheLookup
    @FindBy( xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyTheMessageTheProductHasBeenAddedToYourCart;
  //  By verifyTheMessageTheProductHasBeenAddedToYourCart = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    @CacheLookup
    @FindBy( xpath = "//span[@title='Close']")
    WebElement clickOnCross;
    //By clickOnCross = By.xpath("//span[@title='Close']");
    @CacheLookup
    @FindBy( xpath = "//span[@class='cart-label']")
    WebElement mouseHoverOnShoppingCart;
   // By  mouseHoverOnShoppingCart = By.xpath("//span[@class='cart-label']");
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement enterGoToCart;
   // By enterGoToCart = By.xpath("//button[normalize-space()='Go to cart']");
    @CacheLookup
    @FindBy( xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement verifyMessageShoppingCart;
  //  By verifyMessageShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    @CacheLookup
    @FindBy( xpath = "//input[@class='qty-input']")
    WebElement changeQty;
   // By changeQty =  By.xpath("//input[@class='qty-input']");
    @CacheLookup
    @FindBy( xpath = "//button[@id='updatecart']")
    WebElement updateCart;
   // By updateCart = By.xpath("//button[@id='updatecart']");
    @CacheLookup
    @FindBy( xpath = "//span[@class='product-subtotal']")
    WebElement verifyTotal$2950;
   // By verifyTotal$2950 = By.xpath("//span[@class='product-subtotal']");
    @CacheLookup
    @FindBy( id = "termsofservice")
    WebElement clickOnTermsAndCondition;
   // By clickOnTermsAndCondition = By.id("termsofservice");
    @CacheLookup
    @FindBy( id = "checkout")
    WebElement pressCheckout;
   // By pressCheckout = By.id("checkout");
    @CacheLookup
    @FindBy( xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTheWelcomePleaseSignInText;
   // By verifyTheWelcomePleaseSignInText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    @CacheLookup
    @FindBy( xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutAsGuest;
   // By checkOutAsGuest  = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    @CacheLookup
    @FindBy( id = "BillingNewAddress_FirstName")
    WebElement firstName;
   // By firstName = By.id("BillingNewAddress_FirstName");
    @CacheLookup
    @FindBy( id = "BillingNewAddress_LastName")
    WebElement secondName;
   // By secondName = By.id("BillingNewAddress_LastName");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailAddress;
   // By emailAddress = By.id("BillingNewAddress_Email");
    @CacheLookup
    @FindBy( id = "BillingNewAddress_CountryId")
    WebElement country;
 //   By country = By.id("BillingNewAddress_CountryId");
    @CacheLookup
    @FindBy( id = "BillingNewAddress_City")
    WebElement city;
   // By city = By.id("BillingNewAddress_City");
    @CacheLookup
    @FindBy( id = "BillingNewAddress_Address1")
    WebElement address1;
   // By address1 = By.id("BillingNewAddress_Address1");
    @CacheLookup
    @FindBy( id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
   // By postCode = By.id("BillingNewAddress_ZipPostalCode");
    @CacheLookup
    @FindBy( id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
   // By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement selectContinue;
  //  By selectContinue = By.xpath("//button[@onclick='Billing.save()']");
    @CacheLookup
    @FindBy( id = "shippingoption_1")
    WebElement NextDayAir;
   // By NextDayAir = By.id("shippingoption_1");
    @CacheLookup
    @FindBy( xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement clickContinue;
  //  By clickContinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    @CacheLookup
    @FindBy( xpath = "//input[@id='paymentmethod_1']")
    WebElement clickCreditCard;
   // By clickCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement clickCon;
  //  By clickCon = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    @CacheLookup
    @FindBy( id = "CreditCardType")
    WebElement selectCreditCard;
   // By selectCreditCard = By.id("CreditCardType");
    @CacheLookup
    @FindBy( id = "CardholderName")
    WebElement cardHolderName;
   // By cardHolderName = By.id("CardholderName");
    @CacheLookup
    @FindBy( id = "CardNumber")
    WebElement cardNumber;
   // By cardNumber = By.id("CardNumber");
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expirationMonth;
  //  By expirationMonth = By.id("ExpireMonth");
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expirationYear;
 //   By expirationYear = By.id("ExpireYear");
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
  //  By cardCode = By.id("CardCode");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement cardContinueButton;
 //   By cardContinueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement verifyCreditCard;
 //   By verifyCreditCard = By.xpath("//span[normalize-space()='Credit Card']");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next Day Air']")
    WebElement verifyNextDayAir;
 //   By verifyNextDayAir = By.xpath("//span[normalize-space()='Next Day Air']");
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement verifyTotal;
   // By verifyTotal = By.xpath("//span[@class='product-subtotal']");
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement clickConfirm;
  //  By clickConfirm = By.xpath("//button[normalize-space()='Confirm']");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyTextThankYou;
  //  By verifyTextThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    @CacheLookup
    @FindBy( xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement veryTextOrderSuccessfully;
 //   By veryTextOrderSuccessfully = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    @CacheLookup
    @FindBy( xpath = "//button[normalize-space()='Continue']")
    WebElement continueClick;
  //  By continueClick = By.xpath("//button[normalize-space()='Continue']");
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement verifyWelcome;
  //  By verifyWelcome = By.xpath("//h2[normalize-space()='Welcome to our store']");

    public void clickOnComputerMenu(){
        clickOnElement(computerMenu1);
    }

    public void clickOnDesktopMenu() {
        clickOnElement(desktop);
    }
    public void setSortByNameZToA() {
        clickOnElement(sortByNameZToA);
    }
    public String getMessage() {
        return getTextFromElement(sortByNameZToA);
    }
    public void setSortByNameAtoZ(String AtOZ) {
        selectByValueFromDropDown(sortByNameAtoZ, AtOZ);
    }
    public void setAddTOCartButton() {
        clickOnElement(addTOCartButton);
    }
    public String getBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }
    public void setSelectGHzIntelPentiumDualCoreE2200(String E2200) {
        selectByValueFromDropDown(selectGHzIntelPentiumDualCoreE2200, E2200);
    }
    public void setSelect8GBRAM(String Ram) {
        selectByValueFromDropDown(select8GBRAM, Ram);
    }
    public void setSelectHDD400GB() {
        clickOnElement(selectHDD400GB);
    }
    public void setSelectVistaPremium() {
        clickOnElement(selectVistaPremium);
    }
    public void setCheckBoxOfMicroSoftOffice() {
        clickOnElement(checkBoxOfMicroSoftOffice);
    }
    public void setCheckBoxOfTotalCommander() {
        clickOnElement(checkBoxOfTotalCommander);
    }
    public void setClickOnAddToCartButton() {
        clickOnElement(clickOnAddToCartButton);
    }
    public String setSelectPriceValue1475() {
        return getTextFromElement(selectPriceValue1475);
    }
    public String setVerifyTheMessageTheProductHasBeenAddedToYourCart() {
    return getTextFromElement(verifyTheMessageTheProductHasBeenAddedToYourCart);
    }
    public void setClickOnCross(){
        clickOnElement(clickOnCross);
    }
    public void setMouseHoverOnShoppingCart(){
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    public void setEnterGoToCart(){
        clickOnElement(enterGoToCart);
    }
    public String setVerifyMessageShoppingCart (){
        return getTextFromElement(verifyMessageShoppingCart);
    }
    public void setChangeQty(String Qty){
        clearTextOfElement(changeQty);
        sendTextToElement(changeQty,Qty);
    }
    public void setUpdateCart(){
        clickOnElement(updateCart);
    }
    public String setVerifyTotal$2950(){
        return getTextFromElement(verifyTotal$2950);
    }
    public void setClickOnTermsAndCondition(){
        clickOnElement(clickOnTermsAndCondition);
    }
    public void setPressCheckout(){
        clickOnElement(pressCheckout);
    }
    public String setVerifyTheWelcomePleaseSignInText(){
        return getTextFromElement(verifyTheWelcomePleaseSignInText);
    }
    public void setCheckOutAsGuest(){
        clickOnElement(checkOutAsGuest);
    }
    public void setFirstName(String Name){
        sendTextToElement(firstName,Name);
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
    public void setSelectContinue(){
        clickOnElement(selectContinue);
    }
    public void setNextDayAir(){
         clickOnElement(NextDayAir);
    }
    public void setClickContinue(){
         clickOnElement(clickContinue);
    }
    public void setClickCreditCard(){
         clickOnElement(clickCreditCard);
    }
    public void setClickCon(){
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
    public void setCardContinueButton(){
        clickOnElement(cardContinueButton);
    }
    public String setVerifyCreditCard(){
        return getTextFromElement(verifyCreditCard);
    }
    public String setVerifyNextDayAir(){
        return getTextFromElement(verifyNextDayAir);
    }
    public String setVerifyTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void setClickConfirm(){
        clickOnElement(clickConfirm);
    }

    public String setVerifyTextThankYou(){
        return getTextFromElement(verifyTextThankYou);
    }
    public String setVeryTextOrderSuccessfully(){
        return  getTextFromElement(veryTextOrderSuccessfully);
    }
    public void setContinueClick(){
        clickOnElement(continueClick);
    }
    public String setVerifyWelcome(){
        return getTextFromElement(verifyWelcome);
    }
}