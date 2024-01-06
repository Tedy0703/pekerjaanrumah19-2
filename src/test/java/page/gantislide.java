package page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class gantislide {

By kliklogin = By.xpath("//*[@id='login2']");
    WebDriver driver;


    public gantislide(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void rubahslide(){
        driver.get("https://www.demoblaze.com/#carouselExampleIndicators");
        driver.findElement(By.xpath("//*[@id='carouselExampleIndicators']/a[2]/span[1]")).click();
      driver.findElement(kliklogin).click();

    }

}
//*[@id="carouselExampleIndicators"]/a[2]/span[1]

