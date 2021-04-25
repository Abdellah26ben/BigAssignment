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
import java.util.*;  


public class BigTest {
    public WebDriver driver;
    
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
  
    
    @Test
    public void testLoginSuccess() {
        MainPage mainPage = new MainPage(this.driver);
        LoginPage loginPage = mainPage.openLogin();
        DashboardPage dashboardPage = loginPage.login("tomsmith","SuperSecretPassword!");
        //System.out.println(dashboardPage.getMainCardTitle());
       // Assert.assertTrue(dashboardPage.getFooterText().contains("Secure Area"));
        System.out.println("Hereeeeeeeeeeeeeeee=>"+ dashboardPage.getLoginSuccessTitle());
        Assert.assertTrue(dashboardPage.getLoginSuccessTitle().contains("Secure Area"));
        //Assert.assertTrue(dashboardPage.findElement(By.className("icon-lock")).getText().contains("Secure Area"));
        //Implement Logout
        dashboardPage.logOut();
               
    }
    

    
    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }

}


