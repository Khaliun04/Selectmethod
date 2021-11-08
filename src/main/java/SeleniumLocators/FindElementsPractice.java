package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        List<WebElement> list = driver.findElements(By.xpath("//li/a"));

        int count = 0;
        for(WebElement links: list){
            if(links.getText().length()<12){
                System.out.println(links.getText());
                System.out.println(links.getAttribute("href"));
                count++;
            }
        }
        System.out.println(count);

    }
}
