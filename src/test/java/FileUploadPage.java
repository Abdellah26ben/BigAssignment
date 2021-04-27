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


class FileUploadPage extends PageBase {

    

    WebElement uploadElement = driver.findElement(By.id("file-upload"));
    WebElement uploadsubmit = driver.findElement(By.id("file-submit"));
    public FileUploadPage(WebDriver driver) {
        super(driver);
        
    }    
    
    public DashboardPage UploadFile(String path){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        uploadElement.sendKeys(path);
        wait.until(ExpectedConditions.elementToBeClickable(uploadsubmit)).click();

        
        
        return new DashboardPage(this.driver);
    }
    
    
}
