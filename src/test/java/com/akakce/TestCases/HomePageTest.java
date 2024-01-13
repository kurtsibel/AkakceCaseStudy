package com.akakce.TestCases;

import com.akakce.BaseTest.BaseTest;
import com.akakce.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage;

    public HomePageTest() {
        initialize();
        homePage=new HomePage();
    }
    @Test(description = "Akakçe ana sayfasına giriş işlemi doğrulanır.")
    public void verifyHomePageOpened(){
        Assert.assertTrue(homePage.isHomePageDisplayed(),"Ana Sayfa Yüklenemedi!");
    }
}
