package assignments;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

    public static void main(String[] args)
    {
        //Open Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        //Select date in date picker table
        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for(WebElement ele:allDates)
        {
            String date=ele.getText();
            if(date.equalsIgnoreCase("28"))
            {
                ele.click();
                break;
            }

        }

    }

}