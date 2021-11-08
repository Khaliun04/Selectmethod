package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        //WebElement typos = driver.findElement(By.linkText("Typos"));
       // typos.click();
        //driver.findElement(By.xpath("//a[@href='/typos']")).click();
        WebElement typos = driver.findElement(By.xpath("//a[@href='/typos']"));
        typos.click();
        WebElement typosText = driver.findElement(By.xpath("//p[contains(text(),'Sometimes')]"));
        System.out.println(typosText.getText());
        driver.navigate().back();
        WebElement lastList = driver.findElement(By.xpath("//li[last()]/a"));
        lastList.click();
    }

}
