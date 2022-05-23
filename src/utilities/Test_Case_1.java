package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Case_1 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement comfyLogo = driver.findElement(By.xpath("//*[@id=\"n-48560\"]"));
        System.out.println(comfyLogo.isDisplayed() ? "Comfy Logo validation PASSED" : "Comfy logo validation FAILED");

        WebElement h2 = driver.findElement(By.id("tagline-container-48604"));
        System.out.println(h2.isDisplayed() ? "Heading 2 validation PASSED" : "Heading 2 validation FAILED");


        Driver.quitDriver();


    }
}
