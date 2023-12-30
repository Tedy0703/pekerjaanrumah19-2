package page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.*;
import java.lang.Thread;

import java.time.Duration;

public class negativepage {
    //*[@id="cartur"]
    WebDriver driver;
    By cart = By.xpath("//*[@id='logout2']");
    By name = By.xpath("//*[@id='name']");

    By country = By.xpath("//*[@id='country']");

    By kota = By.xpath("//*[@id='city']");

    By kartukredit = By.xpath("//*[@id='card']");

    By bulan = By.xpath("//*[@id='month']");

    By tahun = By.xpath("//*[@id='year']");


    public negativepage(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void pilihcart() throws InterruptedException {
//driver.findElement(cart).click();
//Thread.sleep(1000);
        driver.get(" https://www.demoblaze.com/index.html");

        driver.get("https://www.demoblaze.com/cart.html");
        Thread.sleep(7500);
        driver.findElement(By.xpath("//*[@id='page-wrapper']/div/div[2]/button")).click();
        Thread.sleep(1000);
//driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));


    }

    public void inputname(String namee) throws InterruptedException {
        driver.findElement(name).sendKeys(namee);
    }

    public void inputcountry(String countryy) throws InterruptedException {
        driver.findElement(country).sendKeys(countryy);
    }

    public void inputkota(String kotaa) throws InterruptedException {
        driver.findElement(kota).sendKeys(kotaa);
    }
    public void setKartukredit(String kartukreditt) throws InterruptedException {
        driver.findElement(kartukredit).sendKeys(kartukreditt);
    }
    public void setBulan(String bulan1) throws InterruptedException {
        driver.findElement(bulan).sendKeys(bulan1);
    }
    public void yearset(String year1) throws InterruptedException {
        driver.findElement(tahun).sendKeys(year1);
        driver.findElement(By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]")).click();

        Thread.sleep(500);

    }
}
