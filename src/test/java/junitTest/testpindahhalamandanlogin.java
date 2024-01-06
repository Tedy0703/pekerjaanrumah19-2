package junitTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.gantislide;
import page.negativepage;
import page.pilihhp;
import java.io.*;
import java.lang.Thread;

import java.time.Duration;


public class testpindahhalamandanlogin extends Thread {



@Test
    public void hometest() throws InterruptedException {
    // positive test
    WebDriver driver = WebDriverManager.chromedriver().create();

//    HomePage homePage = new HomePage(driver);
//    LoginPage loginPage = new LoginPage(driver);
    gantislide Gantislide = new gantislide(driver);
    pilihhp pilihhp = new pilihhp(driver);
    LoginPage loginPage = new LoginPage(driver);
    negativepage Negativepage = new negativepage(driver);


    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Gantislide.rubahslide();
    Thread.sleep(500);
    loginPage.userinputusername("coba13");
    loginPage.userinputpassword("coba23");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    loginPage.klikloginn();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    pilihhp.menampilkanhp();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

    pilihhp.pilihhpp();
    Thread.sleep(10000);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));



    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));



    //negative case bisa melakukan pembayaran tanpa ada barang dicart
Negativepage.pilihcart();
Negativepage.inputname("Tedy");
    Negativepage.inputcountry("Indo");
    Negativepage.inputkota("malang");
    Negativepage.setKartukredit("41231");
    Negativepage.setBulan("maret");
    Negativepage.yearset("2023");

    Thread.sleep(500);
    }
}
