package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CssSelector {

    public static void main(String[] args) {

        // Initialized the ChromeDriver using WebDriver interface
        WebDriver driver = new ChromeDriver();

        // wait for x amount of time at each step if a locator is not showing up using implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navigate into the desired URL
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

       /*  Locators using Css Locators
         Syntax ==> tagName.className

        * for example if we have the following inputField
        <input type = "text" placeholder = "userName" id = "inputUsername" value = "" >
        We can capture it using the id, so same formula
        tagName#id
        input#inputUsername
     */

        /*
        * Also we can generate the Css Selector using second method
        * we can say
        *
        * tagName{attribute='value']
        *
        * for example if we have the following input field
        *
        * <input type = "text" placeholder = "userName" value = "" >
        *
        * we can generate the CssLocator using this method as:
        *
        * input[placeholder='Username']
        *
        *
        * */

        // Capture the locator by ID for Username field in login page
        driver.findElement(By.id("inputUsername")).sendKeys("Alex Morgan");

        // Capture the locator by name for Password field in login page
        driver.findElement(By.name("inputPassword")).sendKeys("flow");

        // Click on signIn button by className in login page
        driver.findElement(By.className("signInBtn")).click();

        // Locate the error message using CssSelector on login page after wrong username and password
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());


    }

}
