package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ParentToChildUsingXpath {

    public static void main(String[] args) {

        // Initialized the ChromeDriver using WebDriver interface
        WebDriver driver = new ChromeDriver();

        // wait for x amount of time at each step if a locator is not showing up using implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navigate into the desired URL
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Capture locator by link name on login page
        driver.findElement(By.linkText("Forgot your password?")).click();

        /*  How can we target specific element from parent to child using Xpath
        *   it's very simple, the syntax is follow:
        *
        *   //parentTagName/childTagName[index] (only if they do not have unique attributes)
        *
        *   for example we can have the following syntax:
        *   <form>
                <h2> Forgot Password  </h2>
                * <input type = "text" placeholder = "Name"> </input>
                * <input type = "text" placeholder = "Email Address"> </input>
                * <input type = "text" placeholder = "Phone Number"> </input>
        *   </form>
        *
        *   the unique xpath from parent to child should be something like
        *
        *   1: //form/h2 --> this will target the forgot password.
        *   2: //form/input[3] --> this will target the phone number input field based on the indexes
        *
        *  */

        driver.findElement(By.xpath("//form/input[1]")).sendKeys("John Alexander");
        driver.findElement(By.xpath("//form/input[2]")).sendKeys("Someone@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("2023075713");

        // Click on the reset button
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        /*
        *  Now, how to go from parent to child using the cssSelector
        *  It's similar to Xpath, but the only difference is that instead of using the / we are going to use the space between the parent
        *  and the child tag names
        *
        *  for example
        *
        *   parentTagName childTagName
        *
        * */

        System.out.println(driver.findElement(By.cssSelector("form p")).getText());



    }

}
