package SeleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
       WebDriver driver = new FirefoxDriver();
       driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iphone 13 ");
        WebElement clickSearch = driver.findElement(By.name("btnK"));
        clickSearch.click();
        WebElement sec = driver.findElement(By.tagName("nobr"));
        String result = sec.getText().replaceAll("[^0-9.]","");
        double second = Double.parseDouble(result);
        //Today's date is : 10/25/2020
        if(second<3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
