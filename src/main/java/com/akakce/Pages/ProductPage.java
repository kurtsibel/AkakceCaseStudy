package com.akakce.Pages;

import com.akakce.BaseTest.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseTest {

    @FindBy(id = "q")
    private WebElement searchField;

    @FindBy(xpath = "/html/body/div[1]/header/div[3]/form/button/i")
    private WebElement btnSearch;

    @FindBy(xpath = "/html/body/div[2]/ul/li[1]/a/span/span[3]/b")
    private WebElement btnProduct;

    @FindBy(xpath = "//html/body/div[2]/main/div[3]/section[1]/div[4]/div/div[4]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/div[1]/a")
    private WebElement txtNameOfSeller1;

    @FindBy(xpath = "/html/body/main/div[1]/div[1]/div[3]/div/div/span")
    private WebElement btnFollowProduct;

    @FindBy(xpath = "/html/body/main/div[1]/div[1]/div[3]/div")
    private WebElement divFollowProduct;

    @FindBy(xpath = "//button[@type='Sepete git']")
    private WebElement btnGoToCart;

    public void searchProduct(String product) throws InterruptedException {
        PageFactory.initElements(driver, this);
        searchField.click();
        searchField.sendKeys(product);
        Thread.sleep(2000);
        btnSearch.click();
    }

    public void selectFirstProduct() {
        btnProduct.click();
    }

    public void addProductToFollowedProducts() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",divFollowProduct);
        btnFollowProduct.click();
    }

}
