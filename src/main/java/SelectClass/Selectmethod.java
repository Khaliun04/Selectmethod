package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Selectmethod {


   @Test
           public void test() {
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.cars.com/");
       WebElement price = driver.findElement(By.id("make-model-max-price"));
       Select select = new Select(price);
       List<WebElement> prices = select.getOptions();
       Set<String> actualOrder = new LinkedHashSet<>();
       Set<String> expectedOrder = new TreeSet<>();

       for(WebElement pr : prices){
           actualOrder.add(price.getText().trim());
           expectedOrder.add(price.getText().trim());
       }

       Assert.assertEquals(actualOrder,expectedOrder);
   }
}
