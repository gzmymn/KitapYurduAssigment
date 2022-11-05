package com.testinium.test;
import com.testinium.driver.BaseTest;
import com.testinium.pages.PointCatalogPage;
import org.junit.Test;

public class PointCatalogTest extends BaseTest {

    @Test
    public void pointCatalogTest(){
        PointCatalogPage pointCatalogPage = new PointCatalogPage();

        pointCatalogPage.goPointCatalog();
        pointCatalogPage.goAllBooks();
        pointCatalogPage.selectRandomBook();
        pointCatalogPage.addToCart();
        pointCatalogPage.goToFav();
        pointCatalogPage.deleteFav();

    }
}
