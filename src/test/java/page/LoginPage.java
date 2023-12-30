package page;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.*;
import java.lang.Thread;
import java.time.Duration;

public class LoginPage extends Thread {

    WebDriver driver;

By inputusername = By.xpath("//*[@id='loginusername']");

    By inputpassword = By.xpath("//*[@id='loginpassword']");
//    driver.get("https://jayjay.co/");
    //driver.findElement(By.xpath("//h1[text() = 'Gebrakan Kursus Online yang Siap Meroketkan Kariermu']")).isDisplayed();
    //driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[2]/div[2]/a")).click();
By kliklogin = By.xpath("//*[@id='login2']");
    By klikloginn = By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    @Test
    public void userinputusername(String username){


        driver.findElement(kliklogin).click();
        driver.findElement(inputusername).sendKeys(username);

    }
    public void userinputpassword(String password) {

        driver.findElement(inputpassword).sendKeys(password);
    }
    public void klikloginn() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]").click()));
driver.findElement(klikloginn).click();
Thread.sleep(1000);
driver.navigate().refresh();
//        driver.get("https://www.demoblaze.com/cart.html");
//        driver.findElement(By.xpath("///*[@id='navbarExample']/ul/li[4]/a")).click();
//        driver.findElement(By.xpath("//*[@id='page-wrapper']/div/div[2]/button")).click();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }
}

