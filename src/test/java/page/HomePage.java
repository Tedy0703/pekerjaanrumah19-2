package page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
//    public static WebDriver driver;

    WebDriver driver;


public HomePage(WebDriver driver) {
    this.driver = driver;
}

@Test
    public void pindahhalamanlogin() {
//    WebDriver driver;
//    ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--remote-allow-origins=*");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://jayjay.co/");
        driver.findElement(By.xpath("//h1[text() = 'Gebrakan Kursus Online yang Siap Meroketkan Kariermu']")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[2]/div[2]/a")).click();


//                /html/body/div[1]/header/div/div/div/div/div[2]/div[2]/a
//
//        driver.quit();
//        System.out.println("Test Selenium Success");
    }
}
