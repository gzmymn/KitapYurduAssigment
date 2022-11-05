package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {

        methods = new Methods();
    }

    public void searchToy(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        logger.info("Oyuncak ürünü aratıldı.");
        methods.waitBySeconds(5);
    }

    public void scrollAndHover(){
        methods.scrollToElement(methods.findElements(By.cssSelector(".grid_7>div.name")).get(6));
        logger.info("Yedinci ürüne scroll edildi.");
        methods.waitBySeconds(5);
    }

    public void scrollAndAddFav() {

        int i=7;
        List<WebElement> listElement= methods.listElement(By.cssSelector(".add-to-favorites>.fa.fa-heart"));
        while (i<11){
            listElement.get(i).click();
            i++;
            methods.waitBySeconds(2);
        }
        logger.info("Dört ürün favorilere eklendi.");
        Assert.assertTrue("Ürün favorilere eklenemedi",methods.isElementVisible(By.id("swal2-title")));
        logger.info("Favorilere eklendiği pop-up ile kontrol edildi");

    }

}
