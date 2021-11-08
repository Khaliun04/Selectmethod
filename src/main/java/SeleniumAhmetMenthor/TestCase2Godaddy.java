package SeleniumAhmetMenthor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2Godaddy {
    public static void main(String[] args) {

        /*
        Test Case 2 - Open Godaddy.com and Print it's Page title.
        Steps to Automate:
        1. Launch browser of your choice say., Firefox, chrome etc.
        2. Open this URL - https://www.godaddy.com/
        3. Maximize or set size of browser window.
        4. Get Title of page and print it.
        4. Get URL of current page and print it.
        5. Close browser.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.godaddy.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());

        if(driver.getTitle().equals(title)){
            System.out.println("your test in the pass");
        }else{
            System.out.println("your test fails");
        }
        driver.close();
    }
}
