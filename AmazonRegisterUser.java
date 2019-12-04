package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class AmazonRegisterUser {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open Flipkart site through Chrome Browser
        String baseURL = "https://www.amazon.in/";
        driver.get(baseURL);
        Thread.sleep(5000);
       //Click sign in button
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        Thread.sleep(4000);
        //driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
        //Fill Login Credentials
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("tripathy.rojaleen@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("nisum530");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        //Search product and add to bag
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bag", Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(),'Water ')]")).click();
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
        //Proceed to Checkout
        driver.findElement(By.partialLinkText("Proceed")).click();
    }
}
