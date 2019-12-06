package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.*;

public class DynamicTable {

    public static void main(String[] args) {

        // Open Chrome Browser

        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
        String baseURL = " http://demo.guru99.com/test/web-table-element.php";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        // Count rows and columns in  table
        List col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " + col.size());
        List rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td"));
        System.out.println("No of rows are : " + rows.size());

        //Fetch data from  row and column

        WebElement tableCount = driver.findElement(By.xpath("//table[@class='dataTable']"));
        WebElement tablebody = tableCount.findElement(By.tagName("tbody"));
        List<WebElement> rowCount = tablebody.findElements(By.tagName("tr"));

       /* //Without use of stream

        for (int i = 0; i < rowCount.size(); i++) {
            List<WebElement> columncount = rowCount.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < columncount.size(); j++) {
                System.out.println(columncount.get(j).getText());

            }
        }*/

        //  Use of stream

        rowCount.stream().map(webElement -> webElement.findElements(By.tagName("td"))).flatMap(Collection::stream).map(WebElement::getText).forEach(System.out::println);

        // Fetch Specific value (user-defind) from rows and column

        Scanner sc = new Scanner(System.in);
        int rownumber = sc.nextInt();
        System.out.println("Enter the row no: " + rownumber);
        int columnnumber = sc.nextInt();
        System.out.println("Enter the column no: " + columnnumber);
        List<WebElement> columncount = rowCount.get(rownumber).findElements(By.tagName("td"));
        System.out.println(columncount.get(columnnumber).getText());

        //Fetch from a particular row

        System.out.println("Enter the row no for fetching all value from that row: " + rownumber);
        System.out.println(rowCount.get(rownumber).getText());


    }
}



