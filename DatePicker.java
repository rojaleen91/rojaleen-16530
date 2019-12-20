package assignments;

import java.text.ParseException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {

    private boolean CheckMonth(String inputDate) throws ParseException {

        int indexOfSpace = inputDate.indexOf(' ');
        String datePart = inputDate.substring(0, indexOfSpace);
        String[] out = datePart.split("/");
        System.out.println("Year = " + out[2]);
        System.out.println("Month = " + out[0]);
        System.out.println("Day = " + out[1]);

        switch (Integer.parseInt(out[0]))
        {
            case 2:
                if(Integer.parseInt(out[1]) <= 28)
                    return true;
                else
                    return false;
            case 4:
            case 6:
            case 9:
            case 11:
                if(Integer.parseInt(out[1]) <= 30)
                    return true;
                else
                    return false;
            default:
                if(Integer.parseInt(out[1]) <= 31)
                    return true;
                else
                    return false;
        }
    }
    @Test
    public void testDAtePicker() throws Exception {

        //DAte and Time to be set in textbox

        String dateTime = "02/29/2015 2:00 am";//month/date/year hour:minute am/pm

        if(!CheckMonth(dateTime)) {
            System.out.println("Date format not in correct/format");
            return;
        }
        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //button to open calendar

        WebElement selectDate = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_dateview']"));

        selectDate.click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //button to move next in calendar

        WebElement nextLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-next')]"));

        //button to click in center of calendar header

        WebElement midLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-fast')]"));

        //button to move previous month in calendar

        WebElement previousLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-prev')]"));

        //Split the date time to get only the date part

        String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");

        //get the year difference between current year and year to set in calander

        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);

        midLink.click();

        if (yearDiff != 0) {

            //if you have to move next year

            if (yearDiff > 0) {

                for (int i = 0; i < yearDiff; i++) {

                    System.out.println("Year Diff->" + i);

                    nextLink.click();

                }

            }

            //if you have to move previous year

            else if (yearDiff < 0) {

                for (int i = 0; i < (yearDiff * (-1)); i++) {

                    System.out.println("Year Diff->" + i);

                    previousLink.click();

                }

            }

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Get all months from calendar to select correct one

        List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));

        list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //get all dates from calendar to select correct one

        List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));

        list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ///FOR TIME

        WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //click time picker button

        selectTime.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //get list of times

        List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));

        int indexOfSpace = dateTime.indexOf(" ", 0);

        dateTime = dateTime.substring(indexOfSpace+1, dateTime.length());

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //select correct time

        for (WebElement webElement : allTime) {

            if (webElement.getText().equalsIgnoreCase(dateTime)) {

                webElement.click();

            }

        }
    }
}
