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

import org.openqa.selenium.interactions.Actions;


class HoverPage extends PageBase {

    

    WebElement img = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img"));
    WebElement subMenu = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/a"));
    public HoverPage(WebDriver driver) {
        super(driver);
        
    }    
    
    public DashboardPage hover(){
        //Instantiating Actions class
        Actions actions = new Actions(driver);

        //Hovering on main menu
        actions.moveToElement(img);
       
       //To mouseover on sub menu
        actions.moveToElement(subMenu);

        //build()- used to compile all the actions into a single step 
        actions.click().build().perform();

        
        
        return new DashboardPage(this.driver);
    }
    
    
}
