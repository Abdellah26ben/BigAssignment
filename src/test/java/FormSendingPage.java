import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


class FormSendingPage extends PageBase {

    private By emailInputBoxBy = By.name("email");
    

    public FormSendingPage(WebDriver driver) {
        super(driver);
    }    
    
    public DashboardPage sendFormInfo(String email){
        this.waitAndReturnElement(emailInputBoxBy).sendKeys(email+"\n");
        return new DashboardPage(this.driver);
    }
    
    
}