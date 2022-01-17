package org.homework19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassOne extends BaseTest{

    @Test
    public void uploadFile(){
        try {
            driver.get("https://theautomationzone.blogspot.com/");
            Thread.sleep(200);
            WebElement uploadFileButton = driver.findElement(By.xpath("//input[@class='input-file']"));
            uploadFileButton.sendKeys("C:\\Users\\Buravchik\\Desktop\\bee-on-daisy.jpg"); //please correct path of bee-on-daisy.jpg file
            WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
            submitButton.click();
            String desiredURL = "https://theautomationzone.blogspot.com/?full_name=&father_name=&mother_name=&email=&mobile=&dob=&gender=Male&course=Select+Course&Address=Address&photo=bee-on-daisy.jpg&submit=";
            Assert.assertEquals(driver.getCurrentUrl(),desiredURL);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
