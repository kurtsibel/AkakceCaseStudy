package com.akakce.Pages;

import com.akakce.BaseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    @FindBy(id = "H_c_v8")
    public WebElement btnCategories;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isHomePageDisplayed() {
        if (btnCategories.isDisplayed()) {
            logger.info("Ana Sayfa basari ile acildi.");
            return true;
        } else {
            logger.info("Ana Sayfa acilma islemi BASARISIZ!");
            return false;
        }
    }
}
