package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Case_5 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement checkBoxInput = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));

        WebElement checkBox = driver.findElement(By.xpath("//label[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']/div"));

        checkBox.click();

        System.out.println(checkBoxInput.isSelected() ? "Check box select input validation PASSED" : "Check box select input validation FAILED");

        checkBox.click();

        System.out.println(!checkBoxInput.isSelected() ? "Check box de-select input validation PASSED" : "Check box de-select input validation FAILED");

        Driver.quitDriver();

    }
}
