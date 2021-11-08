package Seleniumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethod {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //no matter code will stop on this line.
        //it is not recommended
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.techtorialacademy.com/");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println(driver.getPageSource());//returns the html page it is also return String

    }
}
