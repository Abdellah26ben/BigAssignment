

import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;


class DragDropPage extends PageBase {

    
    //Element which needs to drag
    WebElement fromB = driver.findElement(By.xpath("//div[@id='columns']/div[@id='column-b']"));
    //WebElement fromB = driver.findElement(By.xpath("//*[@id='column-b']"));
    //Element on which need to drop
    WebElement toA = driver.findElement(By.xpath("//div[@id='columns']/div[@id='column-a']"));
   // WebElement toA = driver.findElement(By.xpath("//*[@id='column-a']"));
    public DragDropPage(WebDriver driver) {
        super(driver);
        
    }    
    
    public DashboardPage fromBtoA(){

        
        //Using Action class for drag and drop.		
        
        //Creating object of Actions class to build composite actions
        Actions act = new Actions(driver);    
       
        //Thread.sleep(2000);
        act.clickAndHold(fromB).moveToElement(toA).release().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(fromB)).click();
        wait.until(ExpectedConditions.elementToBeClickable(toA)).click();
        
        String textTo = toA.getText();
        if(textTo.equals("A")) {
        System.out.println("PASS: B is dropped to target as expected");
        }else {
        System.out.println("FAIL: B couldn't be dropped to target as expected");
        }
        return new DashboardPage(this.driver);
    }
    
    
}
