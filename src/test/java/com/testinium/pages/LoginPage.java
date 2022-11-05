package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage() {

        methods = new Methods();
    }

    public void login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(5);
        logger.info("Giriş yap'a tıklandı.");

        methods.sendKeys(By.id("login-email"),"gizemkubra.yaman@testinium.com");
        methods.waitBySeconds(5);
        methods.sendKeys(By.cssSelector(".ky-form-group>#login-password"),"Gizem1234");
        methods.waitBySeconds(2);
        logger.info("Giriş bilgileri dolduruldu.");

        methods.click(By.cssSelector(".ky-login-btn"));
        methods.waitBySeconds(15);

        // sayfaya login olması kontrol edilir
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".common-sprite>b")));
        logger.info("Login olundu.");
        methods.waitBySeconds(3);


    }
}
