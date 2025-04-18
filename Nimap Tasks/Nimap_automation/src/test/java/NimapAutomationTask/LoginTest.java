package NimapAutomationTask;

import org.testng.annotations.DataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;


    @Test(priority=1)
    void openapp()
    {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testffc.nimapinfotech.com/");
        driver.manage().window().maximize();

    }
    @Test(priority=2)
    void testLogin()
    {
        driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("minalkamble16356@gmail.com");
        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("minal@123");
        driver.findElement(By.xpath("//button[@id='kt_login_signin_submit']")).click();

    }
    @Test(priority=3)
    void addCustomer()
    {
        driver.findElement(By.xpath("//span[text()='My Customers']")).click();
        driver.findElement(By.xpath("//span[text( )=' New Customer ']")).click();
        driver.findElement(By.xpath("//input[@data-placeholder='Lead/Customer Name']")).sendKeys("Jhon");
        driver.findElement(By.xpath("//input[@data-placeholder='Contact Person Name']")).sendKeys("Denial");
        driver.findElement(By.xpath("//input[@data-placeholder='Mobile Number']")).sendKeys("9823456778");
        driver.findElement(By.xpath("//input[@data-placeholder='Email']")).sendKeys("jhon@gmail.com");
        driver.findElement(By.xpath("//span[text( )=' Save ']")).click();
        driver.close();
    }

   /* @Test(priority = 2)
    public void punchInTest() {
        WebElement ele = driver.findElement(By.xpath(span[normalize-space()="Punch In"])).click();
        WebElement toastMsg = driver.findElement(By.className("mat-button-wrapper"));
        assert toastMsg.getText().contains("Punch In Successful");
    }*/

}
