package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        WebElement homeCheck = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        homeCheck.click();
        WebElement toggle = driver.findElement(By.xpath("//button[@aria-label='Toggle']"));
        toggle.click();
    }

}
