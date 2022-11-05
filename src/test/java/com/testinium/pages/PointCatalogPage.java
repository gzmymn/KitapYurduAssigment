package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PointCatalogPage {

    Methods methods;
    Logger logger = LogManager.getLogger(PointCatalogPage.class);

    public PointCatalogPage(){

        methods =  new Methods();
    }

    public void goPointCatalog(){
        methods.click(By.cssSelector(".lvl1catalog"));
        logger.info("Puan Kataloğu iconu'na tıklandı.");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        logger.info("Türk klasikleri'ne tıklandı.");
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector(".sort>select"), "Yüksek Oylama");
        logger.info("Yüksek Oylama filtresi yapıldı.");
        methods.waitBySeconds(5);

    }

    public void goAllBooks() {
        WebElement element = methods.findElement(By.xpath(".//span[contains(text(),'Tüm Kitaplar')]"));
        logger.info("Tüm Kitaplar'a tıklandı.");
        methods.waitBySeconds(2);
        methods.scrollToElement(element);
        methods.waitBySeconds(1);
        element.findElement(By.xpath("//*[text()='Hobi']")).click();
        logger.info("Hobi kategorisine tıklandı.");
        methods.waitBySeconds(2);
    }

    public void selectRandomBook(){
        methods.randomElement(By.cssSelector(".pr-img-link>img")).click();
        logger.info("Rastgele ürün seçildi.");
        methods.waitBySeconds(3);

    }

    public void addToCart(){
        methods.findElement(By.id("button-cart")).click();
        logger.info("Seçilen ürün sepete eklendi.");
        methods.waitBySeconds(3);

    }

    public void goToFav(){
        methods.hoverElement(By.xpath("//div[@class='menu top my-list']"));
        logger.info("Listelerim'e tıklandı.");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        logger.info("Favorilerime gidildi.");
        methods.waitBySeconds(3);
    }

    public void deleteFav(){
        methods.findElement(By.xpath("(//a[@data-title='Favorilerimden Sil'])[3]")).click();
        logger.info("Favorilerimdeki üçüncü ürün silindi.");
        methods.waitBySeconds(2);
    }



}
