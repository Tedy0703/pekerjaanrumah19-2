

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.LoginPage;
import page.gantislide;
import page.negativepage;
import page.pilihhp;

import java.time.Duration;

public class positivenegativeteststepdef {
    WebDriver driver;
    gantislide Gantislide = new gantislide(driver);
    pilihhp pilihhp = new pilihhp(driver);
    LoginPage loginPage = new LoginPage(driver);
    negativepage Negativepage = new negativepage(driver);
    @Before
    public void beforeTest(){
        driver = WebDriverManager.chromedriver().create();

        driver.manage().window().maximize();
    }
    @After
    public void AfterTest(){
driver.close();

    }
    @Given("masuk berada halaman login")
    public void masukberadahalamanlogin() throws InterruptedException{
        driver.get("https://www.demoblaze.com/#carouselExampleIndicators");
        driver.findElement(By.xpath("//*[@id='carouselExampleIndicators']/a[2]/span[1]")).click();
        By kliklogin = By.xpath("//*[@id='login2']");
        driver.findElement(kliklogin).click();
        Thread.sleep(500);

    }
    @And("mengisikan user{string}")
    public void mengisikanUser(String username) {
        By inputusername = By.xpath("//*[@id='loginusername']");

//        By inputpassword = By.xpath("//*[@id='loginpassword']");
        driver.findElement(inputusername).sendKeys(username);
    }
    @And("mengisikan password{string}")
    public void mengisikanPassword(String password) {
        By inputpassword = By.xpath("//*[@id='loginpassword']");

        driver.findElement(inputpassword).sendKeys(password);
    }


    @Then("login")
    public void login() throws InterruptedException {
        By klikloginn = By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]");
        driver.findElement(klikloginn).click();
        Thread.sleep(5000);
    }

    @Then("memilih barang untuk ke cart")
    public void memilihBarangUntukKeCart() {

        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    }

    @Then("pilih")
    public void pilih() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a")).click();
        driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();
        driver.get("https://www.demoblaze.com/cart.html");
        Thread.sleep(5000);
    }


    @Given("logout akun")
    public void logoutAkun() throws InterruptedException {

        driver.get(" https://www.demoblaze.com/index.html");
        driver.navigate().refresh();
        driver.get("https://www.demoblaze.com/cart.html");
        Thread.sleep(5500);

    }

    @And("input informasi nama{string}")
    public void inputInformasiNama(String nama) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='page-wrapper']/div/div[2]/button")).click();
        Thread.sleep(5500);
        By name = By.xpath("//*[@id='name']");
        driver.findElement(name).sendKeys(nama);


    }

    @And("input informasi daerah{string}")
    public void inputInformasiDaerah(String countryy) {
        By country = By.xpath("//*[@id='country']");
        driver.findElement(country).sendKeys(countryy);


    }

    @And("input informasi kota{string}")
    public void inputInformasiKota(String cityy) {
        By city = By.xpath("//*[@id='city']");
        driver.findElement(city).sendKeys(cityy);


    }

    @And("input nomor kartu{string}")
    public void inputNomorKartu(String cardd) {
        By card = By.xpath("//*[@id='card']");
        driver.findElement(card).sendKeys(cardd);


    }

    @And("input bulan{string}")
    public void inputBulan(String monthh) {
        By month = By.xpath("//*[@id='month']");
        driver.findElement(month).sendKeys(monthh);



    }

    @And("input tahun{string}")
    public void inputTahun(String yearr) {
        By year = By.xpath("//*[@id='year']");
        driver.findElement(year).sendKeys(yearr);
    }

    @Then("pilih purchase")
    public void pilihPurchase() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]")).click();

        Thread.sleep(500);
    }
}
