package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIDByNameByClassName {

    public static void main(String[] args) {

        // Initialized the ChromeDriver using WebDriver interface
        WebDriver driver = new ChromeDriver();

        // Navigate into the desired URL
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Capture the locator by ID for Username field in login page
        driver.findElement(By.id("inputUsername")).sendKeys("Alex Morgan");

        // Capture the locator by name for Password field in login page
        driver.findElement(By.name("inputPassword")).sendKeys("flow");

        // Click on signIn button by className in login page
        driver.findElement(By.className("signInBtn")).click();

        // quit the ChromeDriver after test is finished
        driver.quit();

    }

}
