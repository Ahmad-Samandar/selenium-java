package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WritingLocatorBasedOnRegularExpression {

    public static void main(String[] args) throws InterruptedException {


        // Initialized the ChromeDriver using WebDriver interface
        WebDriver driver = new ChromeDriver();

        // wait for x amount of time at each step if a locator is not showing up using implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navigate into the desired URL
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Capture locator by link name on login page
        driver.findElement(By.linkText("Forgot your password?")).click();

        /* There is an issue when we click on the reset button and we need the page to be loaded first and the continue with the
         *  execution, so for that reason we are going to add a wait of maybe 1 or 2 seconds in order for the page to complete
         *  it's transition
         *  */

        Thread.sleep(2000);

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

        driver.findElement(By.xpath("//div[contains(@class,'pwd')]/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        // To use regular expression to find an element in the DOM
        /*
        * //element[contains(@attribute,'value')]
        *
        * */

        driver.findElement(By.id("chkboxOne")).click();

        // To target the signIn button with the class submit or SignInBtn it is as

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        // For the forgot password Link it should be as
        driver.findElement(By.xpath("//div[contains(@class,'pwd')]"));

    }

}
