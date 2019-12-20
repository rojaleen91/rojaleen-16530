package assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

    public static void main(String[] args) throws Exception {
        // Open browser

        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Maximize browser

        driver.manage().window().maximize();

        //Open Site

        driver.get("http://demo.guru99.com/popup.php");

        //Click link to open another browswer window

        driver.findElement(By.xpath("html/body/p/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Collect all windowhandles

        ArrayList<String> allWindowHandles = new ArrayList<String>(driver.getWindowHandles());

        //switch to 2nd window handle

        driver.switchTo().window(allWindowHandles.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Enter email is and click submit button in 2nd window

        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("tripathy.rojaleen@gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Switch back to parent window

        driver.switchTo().window(allWindowHandles.get(0));

        //Close driver

        driver.quit();

    }
}
