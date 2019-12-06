package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AmazonRegisterUserUpdated {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Open Flipkart site through Chrome Browser

        String baseURL = "https://www.amazon.in/";
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Click sign in button

        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Fill Login Credential

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

        //delivery address

        driver.findElement(By.xpath("//*[@id=\"enterAddressFullName\"]")).sendKeys("nisum");
        driver.findElement(By.xpath("//*[@id=\"enterAddressPhoneNumber\"]")).sendKeys("9700810772");
        driver.findElement(By.xpath("//*[@id=\"enterAddressPostalCode\"]")).sendKeys("500049");
        driver.findElement(By.xpath("//*[@id=\"enterAddressAddressLine1\"]")).sendKeys("block :d ");
        driver.findElement(By.xpath("//*[@id=\"enterAddressAddressLine2\"]")).sendKeys("ADITYA IMPERIAL HEIGHTS");
        driver.findElement(By.xpath("//*[@id=\"enterAddressLandmark\"]")).sendKeys("NEAR MANJEERA PIPELINE ROAD");
        driver.findElement(By.xpath("//*[@id=\"enterAddressCity\"]")).sendKeys("HYDERABAD");
        driver.findElement(By.xpath("//*[@id=\"enterAddressStateOrRegion\"]")).sendKeys("TELENGANA");
        Select address_type = new Select(driver.findElement(By.xpath("//*[@id=\"AddressType\"]")));
        address_type.selectByIndex(1);
        driver.findElement(By.xpath("//*[@id=\"newShippingAddressFormFromIdentity\"]/div[1]/div[1]/form/div[5]/span/span/input")).click();
        driver.findElement(By.xpath("//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input")).click();

        //close Browser

        driver.close();
        }


    }

