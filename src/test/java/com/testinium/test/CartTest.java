package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.CartPage;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void goToCart(){
        CartPage cartPage = new CartPage();
        cartPage.goToCart();
    }

    @Test
    public void increaseProduct(){
        CartPage cartPage = new CartPage();
        cartPage.increaseProductNum("3");
    }
    @Test
    public void buyProduct(){
        CartPage cartPage = new CartPage();
        cartPage.buyProduct();

    }

    @Test
    public void fillAddressAndPayment(){
        CartPage cartPage = new CartPage();
        cartPage.fillAddressInfo();
        cartPage.paymentInfo();
    }

    @Test
    public void logOut(){
        CartPage cartPage = new CartPage();
        cartPage.logOut();
    }
}
