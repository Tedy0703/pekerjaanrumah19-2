import io.cucumber.java.en.Then;
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

public class negativetestt extends Thread {
    @Test
    @Then("negative test bisa melakukan pembayaran tanpa ada barang yang dipili")
    public void negativeTestBisaMelakukanPembayaranTanpaAdaBarangYangDipili () throws InterruptedException {
 WebDriver driver = WebDriverManager.chromedriver().create();

        negativepage Negativepage = new negativepage(driver);
        driver.manage().window().maximize();
//        driver.get("https://www.demoblaze.com/cart.html");
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
