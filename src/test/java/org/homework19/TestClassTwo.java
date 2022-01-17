package org.homework19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class TestClassTwo extends BaseTest{

    @Test
    public void randomCheckBoxSelector(){
        try {
            driver.get("https://theautomationzone.blogspot.com/");
            Thread.sleep(2000);
            WebElement sampleTableOfDivLink = driver.findElement(By.xpath("//a[contains(text(),'Sample Table of Div')]"));
            sampleTableOfDivLink.click();
            List <WebElement> elements = driver.findElements(By.xpath("//div[@class='divTableCell']/input[@type='checkbox']"));
            WebElement randomCheckbox = elements.get(new Random().nextInt(elements.size()));
            WebElement randomCheckbox1 = elements.get(new Random().nextInt(elements.size()));
            WebElement randomCheckbox2 = elements.get(new Random().nextInt(elements.size()));
            randomCheckbox.click();
            Thread.sleep(200);
            randomCheckbox1.click();
            Thread.sleep(200);
            randomCheckbox2.click();
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
