package org.homework19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class TestClassThree extends BaseTest{
    @Test
    public void randomTableSelector(){
        try {
            driver.get("http://automationpractice.com/");
            Thread.sleep(2000);
            List <WebElement> elements = driver.findElements(By.xpath(
                    "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));
            WebElement randomLink = elements.get(new Random().nextInt(elements.size()));
            randomLink.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
