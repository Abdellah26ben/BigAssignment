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


class DropDownPage extends PageBase {

    

    Select drpOptions = new Select(driver.findElement(By.id("dropdown")));

    public DropDownPage(WebDriver driver) {
        super(driver);
        
    }    
    
    public DashboardPage SelectOption(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        drpOptions.selectByValue("1");
        
        return new DashboardPage(this.driver);
    }
    
    
}
