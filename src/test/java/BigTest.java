import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.NoSuchElementException;
import java.util.*;  


public class BigTest {
    public WebDriver driver;
    
    @Before
    public void setup() {
              

        WebDriverManager.chromedriver().setup();
        //Apply Here options and DesiredCapablities for Chrome Browser
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("disable-extensions");
        chrome_options.addArguments("start-maximized");
        chrome_options.addArguments("disable-infobars");
        capabilities.setCapability(ChromeOptions.CAPABILITY, chrome_options);
        
        capabilities.setCapability("browser", "Chrome");
        
        driver = new ChromeDriver(capabilities);
       
    }
    
  
  
    @Test
    public void testLoginSuccess() {
        MainPage mainPage = new MainPage(this.driver);
        LoginPage loginPage = mainPage.openLogin();
        DashboardPage dashboardPage = loginPage.login("tomsmith","SuperSecretPassword!");
        
        System.out.println("Hereeeeeeeeeeeeeeee=>"+ dashboardPage.getLoginSuccessTitle());
        Assert.assertTrue(dashboardPage.getLoginSuccessTitle().contains("You logged into a secure area!"));
        
        dashboardPage.logOut();
               
    }
    
   
    @Test
    public void sendFormTest() {
        MainPage mainPage = new MainPage(this.driver);
        FormSendingPage formPage = mainPage.sendForm();
        
        DashboardPage dashboardPage = formPage.sendFormInfo("adamben2619@gmail.com");
        
        Assert.assertTrue(dashboardPage.getSendFormMsg().contains("Internal Server Error"));
     
    }
    
   
    @Test
    public void dropdownTest() {
        MainPage mainPage = new MainPage(this.driver);
        DropDownPage dropdownPage = mainPage.openDpDp();
        DashboardPage dashboardPage = dropdownPage.SelectOption();
     
               
    }

    @Test
    public void staticPageTest() {
        MainPage mainPage = new MainPage(this.driver);
        staticPageTest staticPage = mainPage.staticPage();
        System.out.println(staticPage.StaticPage());
    
               
    }
     
    @Test
    public void getTitleTest() {
        MainPage mainPage = new MainPage(this.driver);
        Assert.assertTrue(mainPage.getTitle().contains("The Internet"));
     
               
    }
   
   
    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }

}


