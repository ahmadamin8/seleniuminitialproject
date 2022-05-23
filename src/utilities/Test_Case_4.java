package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Case_4 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement firstName = driver.findElement(By.xpath("//label[text()='First Name*']"));
        WebElement lastName = driver.findElement(By.xpath("//label[text()='Last Name*']"));
        WebElement email = driver.findElement(By.xpath("//label[text()='Email*']"));


        WebElement fNameInput = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement lNameInput = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement emailUser = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement messageUser = driver.findElement(By.xpath("//textarea[@placeholder='Message*']"));


        fNameInput.sendKeys("Ahmad");
        lNameInput.sendKeys("Amin");
        emailUser.sendKeys("ahmadaminmj23@gmail.com");
        messageUser.sendKeys("First Test");


        System.out.println(firstName.getText().equals("First Name*") ? "First name  box validation PASSED" : "First name  box validation FAILED");

        System.out.println(lastName.getText().equals("Last Name*") ? "Last name  box validation PASSED" : "Last name  box validation FAILED");

        System.out.println(email.getText().equals("Email*") ? "Email  box validation PASSED" : "Email  box validation FAILED");

        System.out.println(messageUser.getAttribute("placeholder").equals("Message*") ? "Message  validation PASSED" : "Message  validation FAILED");

        System.out.println(fNameInput.isDisplayed() ? "First name box displayed PASSED" : "First name box displayed FAILED");

        System.out.println(lNameInput.isDisplayed() ? "Last name box displayed PASSED" : "Last name box displayed FAILED");

        System.out.println(emailUser.isDisplayed() ? "Email box displayed PASSED" : "Email box displayed FAILED");

        System.out.println(messageUser.isDisplayed() ? "Message box displayed PASSED" : "Message box displayed FAILED");

        System.out.println(fNameInput.getAttribute("value").equals("Ahmad") ? "First name input match PASSED" : "First name input match FAILED");

        System.out.println(lNameInput.getAttribute("value").equals("Amin") ? "Last name input match PASSED" : "Last name input match FAILED");

        System.out.println(emailUser.getAttribute("value").equals("ahmadaminmj23@gmail.com") ? "Email input match PASSED" : "Email input match FAILED");

        System.out.println(messageUser.getText().equals("First Test") ? "Message input match PASSED" : "Message input match FAILED");

        Driver.quitDriver();


    }
}
