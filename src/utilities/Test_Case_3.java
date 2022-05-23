package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Case_3 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        WebElement h2 = driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']/span"));
        System.out.println(h2.getText().equals("Contact Us") ? "Heading 2 validation PASSED" : "Heading 2 validation FAILED");

        WebElement h4 = driver.findElement(By.xpath("//h4[@data-aid='CONTACT_FORM_TITLE_REND']"));
        System.out.println(h4.getText().equals("SEND US A MESSAGE") ? "Heading 4 validation PASSED" : "Heading 4 validation FAILED");

        Driver.quitDriver();
    }
}
