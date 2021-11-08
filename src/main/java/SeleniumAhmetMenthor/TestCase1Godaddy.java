package SeleniumAhmetMenthor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1Godaddy {
    public static void main(String[] args) throws InterruptedException {

        /*
         Assignment Level - Beginner
         Test Case 1 - Open Godaddy.com and maximize browser window.
         Steps to Automate:
         1. Launch browser of your choice say., Firefox, chrome etc.
         2. Open this URL - https://www.godaddy.com/
         3. Maximize or set size of browser window.
         4. Close browser.
         */

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.godaddy.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //SUGGESTION: If you put all the location correct and still they are not working
        //make the web browser full screen(maximize)
        //SUGGESTION: Please use the THREAD SLEEP
        driver.close();
    }
}
