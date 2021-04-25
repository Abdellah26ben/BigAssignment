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


class MainPage extends PageBase {

    private By loginMenuButtonBy = By.className("HeaderWidget-loginButton");
    private By LoginLink = By.linkText("Form Authentication");
    
    

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver.get("http://the-internet.herokuapp.com");
    }    

    
    
    public LoginPage openLogin() {
        this.waitAndReturnElement(LoginLink).click();
        return new LoginPage(this.driver);
    }
}
