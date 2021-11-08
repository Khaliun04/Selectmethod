package Seleniumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;

public class SeleniumBasics {
    public static void main(String[] args) {

        //we are defining the chromedriver into the project as a property
        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();

        //different way to go to the page
        //get method navigates to the given url
        driver.get("https://www.techtorialacademy.com/");

        //getTitle() method gets the title from page and returns String.
        String title = driver.getTitle();
        //Home page - Techtorial

        if(title.equals("Home Page - Techtorial")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(driver.getCurrentUrl());
    }
}
