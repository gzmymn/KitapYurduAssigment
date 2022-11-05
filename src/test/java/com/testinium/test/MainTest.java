package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.*;
import org.junit.Test;

public class MainTest extends BaseTest {

    @Test
    public void mainTest(){

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();

        loginPage.login();
        productPage.searchToy();
        productPage.scrollAndHover();
        productPage.scrollAndAddFav();
        homePage.homePageReturn();
        pointCatalogPage.goPointCatalog();
        pointCatalogPage.goAllBooks();
        pointCatalogPage.selectRandomBook();
        pointCatalogPage.addToCart();
        pointCatalogPage.goToFav();
        pointCatalogPage.deleteFav();
        cartPage.goToCart();
        cartPage.increaseProductNum("2");
        cartPage.buyProduct();
        cartPage.fillAddressInfo();
        cartPage.paymentInfo();
        cartPage.logOut();


    }


}
