package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkaAndTags {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///Users/khaliun/Desktop/Techtorial.html");

        WebElement java = driver.findElement(By.linkText("Java"));
        java.click();
        System.out.println(driver.getCurrentUrl());
       // WebElement selenium = driver.findElement(By.linkText("Selenium"));
      //  selenium.click();//bc I have to go back the page otherwise give the exception NoSuchElementException

        driver.navigate().back();

        WebElement selenium = driver.findElement(By.linkText("Selenium"));
        selenium.click();

        driver.navigate().back();
        java = driver.findElement(By.linkText("Java"));
        java.click();

        driver.navigate().back();

        WebElement restApi = driver.findElement(By.partialLinkText("Rest"));
        restApi.click();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        WebElement version = driver.findElement(By.tagName("u"));
        System.out.println(version.getText());

        Thread.sleep(6000);
        driver.quit();// It will close browser
    }
}
