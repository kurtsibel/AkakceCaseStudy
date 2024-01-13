package com.akakce.Pages;

import com.akakce.BaseTest.BaseTest;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {


    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div[1]/a[2]")
    private WebElement btnLoginInHomePage;

    @FindBy(id = "life")
    private WebElement userName;

    @FindBy(id = "lifp")
    private WebElement password;

    @FindBy(id = "lfb")
    private WebElement btnLogin;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div/i/a")
    private WebElement btnMyAccount;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButtonInHomePage(){
        btnLoginInHomePage.click();
    }
    public void enterEmail(String mail) {
        userName.sendKeys(mail);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickLoginButton() {
        btnLogin.click();
    }

    public Boolean isEnteredToAccount() throws InterruptedException {

       Thread.sleep(2000);
       String receivedValue = btnMyAccount.getText();
       System.out.println("Çekilen Değer:" + receivedValue);
       if (receivedValue.equals("Sibel")){
           logger.info("Kullanıcı başarılı bir şekilde hesabına giriş yaptı.");
           return true;
       }
       else {
           logger.info("Kullanıcının hesabına girişi BAŞARISIZ!");
           return false;
       }
    }
}
