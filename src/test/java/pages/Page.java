package pages;

import coop.co.uk.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Page extends DriverFactory {

    public String baseurl(){
       return driver.getCurrentUrl();

    }
    public void detail(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.cssSelector("a[class='coop-btn coop-btn--primary']")).click();
        driver.findElement(By.id("member-has-card-no")).click();
        driver.findElement(By.id("register-check-card-button")).click();

        Select dropdown=new Select(driver.findElement(By.id("member-title")));
        System.out.println("Total no of dropdown:"+dropdown.getOptions().size());

        List<WebElement>options=dropdown.getOptions();
        for(WebElement e:options) {
            System.out.println(e.getText());
            dropdown.selectByIndex(1);

        }
        driver.findElement(By.id("member-first-name")).sendKeys("Bhupendra");
        driver.findElement(By.id("member-last-name")).sendKeys("Nayee");

        driver.findElement(By.id("member-day-of-birth")).sendKeys("25");
        driver.findElement(By.id("member-month-of-birth")).sendKeys("10");
        driver.findElement(By.id("member-year-of-birth")).sendKeys("1979");
        driver.findElement(By.id("postcode")).sendKeys("RH10 5HH");
        driver.findElement(By.id("find-address-current")).click();

        //Select house=new Select(driver.findElement(By.cssSelector("ul[class='current-address-list']")));
        //house.getOptions().size();
        driver.findElement(By.xpath("//*[@id=\"postcode-search-results-placeholder\"]/ul/li[14]")).click();




    }

}
