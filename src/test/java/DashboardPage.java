
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


class DashboardPage extends PageBase {

    private By loginSuccess = By.xpath("//*[@id='content']/div/h2");
    private By SuccessSendForm = By.xpath("/html/body/h1");
    private By logoutButton = By.xpath("//*[@id='content']/div/a");

    public DashboardPage(WebDriver driver) {
        super(driver);
        WebDriverWait wait=new WebDriverWait(driver,15);
    }    
    
    public String getLoginSuccessTitle(){
        
        return this.waitAndReturnElement(loginSuccess).getText();
    }

    
    public String getSendFormMsg(){
        return this.waitAndReturnElement(SuccessSendForm).getText();
    }

    public void logOut()
    {
          this.waitAndReturnElement(logoutButton).click();
    }

}





