package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        runSeleniumTest();
    }

    public static void runSeleniumTest() {
        // Chrome - ChromeDriver --> Methods
        WebDriver driver = new ChromeDriver();
        // WebDriver --> Interface --> Methods like get, close .. etc.

        // Navigate into a website using get()
        driver.get("https://www.google.com");

        // get the title of the tab using getTitle() --> Returns void
        System.out.println(driver.getTitle());

        // To check and get the current URL --> Returns void
        System.out.println(driver.getCurrentUrl());

        // You can close the current window using close()
        driver.close();
        driver.quit();
    }
}