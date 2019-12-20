package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverMethods {
    public static void main (String args[]){
        System.setProperty("webdriver.chrome.driver","C:\\Rojaleen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //get()
        driver.get("http://www.google.com");
        //getTitle()
        String x = driver.getTitle();
        System.out.println(x);
        //getPageSource()
        String y = driver.getPageSource();
        System.out.println(y);
        //getCurrentUrl
        String z = driver.getCurrentUrl();
        System.out.println(z);
        //findElement(),sendKeys()
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("television", Keys.ENTER);
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //close()
        driver.close();
    }

}
