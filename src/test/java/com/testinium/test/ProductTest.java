package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.HomePage;
import com.testinium.pages.LoginPage;
import com.testinium.pages.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {


    @Test
    public void productTest(){

        ProductPage productPage = new ProductPage();

        productPage.searchToy();
        productPage.scrollAndHover();
        productPage.scrollAndAddFav();

    }


}
