package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/horizontal_slider");

        WebElement sliderTitle = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
        System.out.println(sliderTitle.getText());

        WebElement sub = driver.findElement(By.xpath("//h4[@class='subheader']"));
        System.out.println(sub.getText());

        WebElement text = driver.findElement(By.xpath("//h3[.='Horizontal Slider']"));
        System.out.println(text.getText());
        WebElement text1 = driver.findElement(By.xpath("//h3[.='Horizontal Slider']"));
        System.out.println(text1.getText());
    }
}
