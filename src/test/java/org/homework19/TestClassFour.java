package org.homework19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassFour extends BaseTest {
    @Test
    public void checkResult(){
        try {
            driver.get("https://theautomationzone.blogspot.com/");
            Thread.sleep(200);
            WebElement buttonOne = driver.findElement(By.xpath("//td/input[@value='1']"));
            buttonOne.click();
            WebElement buttonFive = driver.findElement(By.xpath("//td/input[@value='5']"));
            buttonFive.click();
            WebElement buttonPlus = driver.findElement(By.xpath("//td/input[@value='+']"));
            buttonPlus.click();
            buttonOne.click();
            WebElement buttonZero = driver.findElement(By.xpath("//td/input[@value='0']"));
            buttonZero.click();
            WebElement buttonEquals = driver.findElement(By.xpath("//td/input[@value='=']"));
            buttonEquals.click();
            WebElement inputField = driver.findElement(By.xpath("//input[@id='result']"));
            String textInsideTheField = inputField.getAttribute("value");
            Assert.assertEquals(textInsideTheField,"25");  // we have operation like: 10 + 15 = 25.
            System.out.println("Operation 10 + 15 is successful, result is correct.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
