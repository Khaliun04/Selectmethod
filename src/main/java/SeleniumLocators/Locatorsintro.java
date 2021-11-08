package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsintro {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///Users/khaliun/Desktop/Techtorial.html");

        WebElement header = driver.findElement(By.id("techtorial1"));
        String hd = header.getText();
        String excepted = "Techtorial Academy";
        if(hd.equals(excepted)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        //WebElement checkboxTitle = driver.findElement(By.className("grp_checkbox"));
        //it will give NoSuchElementException
        WebElement checkboxTitle = driver.findElement(By.className("group_checkbox"));
        String actualTitle = checkboxTitle.getText();
        String expectedTitle = "All Tools";
        if(actualTitle.equals(expectedTitle)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        WebElement fName = driver.findElement(By.name("firstName"));
        WebElement lName = driver.findElement(By.name("lastName"));
        WebElement phone = driver.findElement(By.name("phone"));
        WebElement email = driver.findElement(By.name("userName"));
        fName.sendKeys("Khaliun");
        lName.sendKeys("Batbayar");
        phone.sendKeys("233-455-6789");
        email.sendKeys("trn@mail.com");

        WebElement java = driver.findElement(By.id("cond1"));
        WebElement selenium = driver.findElement(By.id("cond2"));
        WebElement testNG = driver.findElement(By.id("cond3"));
        WebElement cucumber = driver.findElement(By.id("cond4"));
        java.click();
        System.out.println(java.isSelected());
        System.out.println(selenium.isSelected());
        System.out.println(testNG.isSelected());
        System.out.println(cucumber.isDisplayed());
        //it will return true since element is displayed on the page

    }
}
