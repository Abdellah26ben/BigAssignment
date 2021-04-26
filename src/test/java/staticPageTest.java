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


class staticPageTest extends PageBase {

    

   
    
    public staticPageTest(WebDriver driver) {
        super(driver);
        
    }    
    
    public DashboardPage findSubmit(){
        if (driver.findElements(By.tagName("form")).isEmpty()) {
            System.out.println("Element form doesn't exist");
        } else {
            System.out.println("Element form exist");
        }
        // drpOptions.selectByValue("1");
        
        return new DashboardPage(this.driver);
    }
    
    
}
