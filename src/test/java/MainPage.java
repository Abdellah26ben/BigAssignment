import java.util.List;

import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
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
        WebDriverWait wait=new WebDriverWait(driver,15);
        
    }    

    
    
    public LoginPage openLogin() {
        //Explicit wait
        wait.until(ExpectedConditions.elementToBeClickable(LoginLink)).click();
        //this.waitAndReturnElement(LoginLink).click();
        return new LoginPage(this.driver);
    }

    public DropDownPage openDpDp() {
        wait.until(ExpectedConditions.elementToBeClickable(DropDownLink)).click();
        //this.fin(DropDownLink).click();
        return new DropDownPage(this.driver);
    }

    public staticPageTest staticPage() {

        //Testing here different Static Pages 
        WebElement opentabs = driver.findElement(By.xpath("//div[@id='content']/ul"));
        List<WebElement> listli = opentabs.findElements(By.tagName("li"));

        System.out.println(listli.size());
        
        for(WebElement LiElement:listli){
            
        
            
            List<WebElement> a_tags = LiElement.findElements(By.tagName("a"));
            //System.out.println("the first Li=>"+LiElement.getText());
            for(WebElement aElement :a_tags){
                
               if(aElement.getText().matches("A/B Testing|Shifting Content|Context Menu"))
               {
                String openTabsAgain = Keys.chord(Keys.CONTROL,Keys.ENTER);
                wait.until(ExpectedConditions.elementToBeClickable(aElement)).sendKeys(openTabsAgain);
               }
            }
                
             }
        
    
        return new staticPageTest(this.driver);
    }

    public FormSendingPage sendForm() {

        wait.until(ExpectedConditions.elementToBeClickable(LoginLink)).click();
        //this.waitAndReturnElement(formSendLink).click();
        return new FormSendingPage(this.driver);
    }

    public String getTitle() {
       String Actualtitle =  driver.getTitle();
       //Explicit wait 
       wait.until(ExpectedConditions.titleIs(Actualtitle));
        return Actualtitle;
    }


}

