package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.sikuli.script.*;

public class VideoHandling {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.radiantmediaplayer.com/test-your-streaming-url.html");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Screen screen = new Screen();

        screen.click("C:\\Users\\nisum\\IdeaProjects\\Javastreams\\play.png");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        screen.wheel(Button.WHEEL_DOWN, 1);

        Location centre = new Location(300, 200);

        screen.wheel(centre, Button.LEFT, 0);

        screen.mouseMove("C:\\Users\\nisum\\IdeaProjects\\Javastreams\\volume.png");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Match imageLoc = screen.find("C:\\Users\\nisum\\IdeaProjects\\Javastreams\\volume.png");

        imageLoc.click();

    }

    }

