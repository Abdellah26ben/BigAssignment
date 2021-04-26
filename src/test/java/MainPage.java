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
    private By DropDownLink = By.linkText("Dropdown");
    private By staticPageLink = By.linkText("Inputs");
    private By formSendLink = By.linkText("Forgot Password");
    
    
    

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver.get("http://the-internet.herokuapp.com");
    }    

    
    
    public LoginPage openLogin() {
        this.waitAndReturnElement(LoginLink).click();
        return new LoginPage(this.driver);
    }

    public DropDownPage openDpDp() {
        this.waitAndReturnElement(DropDownLink).click();
        return new DropDownPage(this.driver);
    }

    public staticPageTest staticPage() {
        this.waitAndReturnElement(staticPageLink).click();
        return new staticPageTest(this.driver);
    }

    public FormSendingPage sendForm() {
        this.waitAndReturnElement(formSendLink).click();
        return new FormSendingPage(this.driver);
    }

    public String getTitle() {
       String Actualtitle =  driver.getTitle();
        return Actualtitle;
    }


}

