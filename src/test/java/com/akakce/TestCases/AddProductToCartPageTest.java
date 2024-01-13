package com.akakce.TestCases;

import com.akakce.BaseTest.BaseTest;
import com.akakce.Pages.ProductPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AddProductToCartPageTest extends BaseTest {

    ProductPage addProductToCartPage;
    String product = "nike kadın spor ayakkabı";

    public AddProductToCartPageTest() {
        super();
        addProductToCartPage = new ProductPage();
    }

    @Test(description = "Kullanıcı sepetine iki farklı satıcıdan ürün ekler.")
    public void addProductToCart() throws InterruptedException {
        Boolean returnValue;
        Boolean returnValue2;
        addProductToCartPage.searchProduct(product);
        Thread.sleep(2000);
        addProductToCartPage.selectFirstProduct();
        Thread.sleep(2000);
        addProductToCartPage.addProductToFollowedProducts();
        Thread.sleep(2000);
    }
}
