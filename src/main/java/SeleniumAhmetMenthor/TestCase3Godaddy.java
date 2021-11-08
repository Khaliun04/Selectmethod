package SeleniumAhmetMenthor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3Godaddy {
    public static void main(String[] args) {

        /*
        Test Case 3 - Open Godaddy.com and Validate Page Title
        Steps to Automate:
        1. Launch browser of your choice say., Firefox, chrome etc.
        2. Open this URL - https://www.godaddy.com/
        3. Maximize or set size of browser window.
        4. Get Title of page and validate it with expected value.
        5. Get URL of current page and validate it with expected value.
        6. Get Page source of web page.
        7. And Validate that page title is present in page source.
        8. Close browser.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.godaddy.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        if(driver.getTitle().equals(title)){
            System.out.println("your test pass");
        }else{
            System.out.println("your test failed");
        }

        String expected = "https://www.godaddy.com/";
        if(driver.getCurrentUrl().equals(expected)){
            System.out.println("your test is pass");
        }else{
            System.out.println("your test failed");
        }
        driver.close();
    }
}
