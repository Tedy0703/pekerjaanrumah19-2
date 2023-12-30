package page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class gantislide {


    WebDriver driver;


    public gantislide(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void rubahslide(){
        driver.get("https://www.demoblaze.com/#carouselExampleIndicators");
        driver.findElement(By.xpath("//*[@id='carouselExampleIndicators']/a[2]/span[1]")).click();

    }

}
//*[@id="carouselExampleIndicators"]/a[2]/span[1]

