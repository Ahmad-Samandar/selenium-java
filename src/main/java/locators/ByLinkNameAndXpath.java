package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ByLinkNameAndXpath {

    public static void main(String[] args) {

        // Initialized the ChromeDriver using WebDriver interface
        WebDriver driver = new ChromeDriver();

        // wait for x amount of time at each step if a locator is not showing up using implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navigate into the desired URL
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Capture the locator by ID for Username field in login page
        driver.findElement(By.id("inputUsername")).sendKeys("Alex Morgan");

        // Capture the locator by name for Password field in login page
        driver.findElement(By.name("inputPassword")).sendKeys("flow");

        // Click on signIn button by className in login page
        driver.findElement(By.className("signInBtn")).click();

        // Locate the error message using CssSelector on login page after wrong username and password
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        // Capture locator by link name on login page
        driver.findElement(By.linkText("Forgot your password?")).click();

        // Fill in the form in the forgot password page which consists of name, password, email.
        /*
        *   Xpath syntax:
        *
        *   ==> //tagName[@attribute='value']
        *
        * */

        // Username --> Using Xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Alex Morgan");

        // Email ==> Using CssSelector
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Alex@someone.com");

        // Phone number --> Using Xpath
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1233138934");

        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();

        // We can also target specific tag by index in case if we face with multiple

        /*
        * for example if we have three input with type = "text"
        *  <input type = "text" placeholder = "Name" >          --> 1
        *  <input type = "text" placeholder = "Email" >         --> 2
        *  <input type = "text" placeholder = "Phone Number" >  --> 3
        *
        *  So if we want to target the second input field based on index, it should be:
        *
        *   //tagName[@attribute='value'][indexNumber]
        *   // input[@type='text][2]
        *
        * */

        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("12345");

    }

}
