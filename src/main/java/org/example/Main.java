package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Chrome - ChromeDriver --> Methods
        WebDriver driver = new ChromeDriver();
       // WebDriver --> Interface --> Methods like get, close .. etc.
        driver.close();

    }
}