package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Button;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;

public class SelectClassMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/register.php");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Scrollng the screen

        Screen screen = new Screen();
        screen.wheel(Button.WHEEL_DOWN, 1);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Select from dropdown by using selectByVisibleText

        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("ALGERIA");

        //Selecting Items in a Multiple SELECT elements

        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);

    }
}
