package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class CartPage {
    Methods methods;
    Logger logger = LogManager.getLogger(PointCatalogPage.class);

    public CartPage() {
        methods = new Methods();
    }

    public void goToCart() {
        methods.findElement(By.xpath("//h4[@class='common-sprite']")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.id("js-cart")).click();
        logger.info("Sepetim sekmesine gidilir.");
        methods.waitBySeconds(3);

    }

    public void increaseProductNum(String num){
        methods.clear(By.xpath("//input[@name='quantity']"));
        methods.sendKeys(By.xpath("//input[@name='quantity']"),num);
        methods.click(By.xpath("//i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='right']"));
        logger.info("Sepetteki ürün adedi arttırıldı.");
        methods.waitBySeconds(3);

    }

    public void buyProduct(){
        methods.findElement(By.cssSelector(".button.red")).click();
        logger.info("Ürün Satın Al tıklandı.");
        methods.waitBySeconds(3);
    }


    public void fillAddressInfo(){
        methods.findElement(By.id("address-firstname-companyname")).click();
        methods.sendKeys(By.id("address-firstname-companyname"),"Gizem");
        methods.sendKeys(By.id(("address-lastname-title")),"Yaman");
        methods.selectByText(By.id("address-country-id"),"Türkiye");
        methods.selectByText(By.id("address-zone-id"),"İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("address-county-id"), "MALTEPE");
        methods.sendKeys(By.id("address-address-text"),"adres deneme");
        methods.sendKeys(By.id("address-mobile-telephone"),"5553334455");
        methods.waitBySeconds(3);
        methods.click(By.id("button-checkout-continue"));
        logger.info("Adres bilgileri doldurulup kaydedildi.");
        methods.waitBySeconds(5);
    }

    public void paymentInfo(){
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit-card-owner"),"Gizem Yaman");
        methods.sendKeys(By.id("credit_card_number_1"),"1111");
        methods.sendKeys(By.id("credit_card_number_2"),"2222");
        methods.sendKeys(By.id("credit_card_number_3"),"3333");
        methods.sendKeys(By.id("credit_card_number_4"),"4444");
        methods.selectByText(By.id("credit-card-expire-date-month"),"11");
        methods.selectByText(By.id("credit-card-expire-date-year"),"2028");
        methods.sendKeys(By.id("credit-card-security-code"),"111");
        methods.click(By.id("button-checkout-continue"));
        logger.info("Geçersiz ödeme bilgileri girildi");
        methods.waitBySeconds(5);
        methods.isElementVisible(By.xpath("//span[@class='error']"));
        logger.info("Hata alındı.");
        methods.waitBySeconds(3);

    }

    public void logOut(){
        methods.click(By.xpath("//img[@title='kitapyurdu.com']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector("common-sprite"), "Çıkış");
        logger.info("Çıkış yapıldı.");
        methods.waitBySeconds(3);

    }
}
