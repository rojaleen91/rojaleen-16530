package stepDefinations;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import java.util.List;

import static org.junit.Assert.*;

public class LoginStepDefinations {
    WebDriver driver;
@Given("^User is already on login page$")
    public void user_already_on_login_page() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.freecrm.com/index.html");
    Thread.sleep(4000);

}
    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_free_CRM() throws InterruptedException {
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(4000);
        assertEquals("Free CRM #1 cloud software for any business large or small", title);
    }
    @Then("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        Thread.sleep(4000);
    driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
    Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	 }
    @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
     driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	 }
    @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 assertEquals("Cogmento CRM", title);
	 }
    @Then("^user enters username and password from datatable$")
    public void user_enters_username_and_password(DataTable credentials) throws InterruptedException {
        List<List<String>> data = credentials.raw();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(0).get(1));
        Thread.sleep(5000);

    }



    @Then("^user moves to new deal page$")
    public void user_moves_to_new_contact_page() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.linkText("Deals")).click();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();

    }

    @Then("^user enters deal details$")
    public void user_enters_contacts_details(DataTable dealData){
        List<List<String>> dealValues =  dealData.raw();
        driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
        driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
        driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
        driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
    }
    @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
}
