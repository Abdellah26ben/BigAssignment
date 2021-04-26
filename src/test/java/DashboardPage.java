/*import org.junit.*;
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

    //private By mainCardBy = By.xpath("//*[@id='udemy']/div[2]/div[3]/div[2]/div[2]/div/div[2]/h2");
   
    
    private By footerBy = By.className("icon-lock");
    

    
    public DashboardPage(WebDriver driver) {
        super(driver);
        //this.driver.get("https://the-internet.herokuapp.com/secure");
    }  
    
    public String getFooterText() {

        return this.waitAndReturnElement(footerBy).getText();
    }

    
    /*public String getMainCardTitle(){
        return this.waitAndReturnElement(mainCardBy).getText();
    }
}*/
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





