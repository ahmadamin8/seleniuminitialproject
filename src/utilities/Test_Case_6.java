package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Case_6 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement sendButton = driver.findElement(By.xpath("//button[@data-aid='CONTACT_SUBMIT_BUTTON_REND']"));

        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled() ? "Send button validation PASSED" : "Send button validation FAILED");

        System.out.println(sendButton.getText().equals("SEND") ? "Send button text validation PASSED" : "Send button text validation FAILED");


    }






}
