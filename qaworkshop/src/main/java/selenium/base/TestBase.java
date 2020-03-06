package selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    private final String url = "https://google.com";

    @BeforeSuite
    public void setChromedriverPath() {
        System.setProperty("webdriver.chrome.driver","C:\\qaworkshop\\chromedriver.exe");
    }

    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //Ustawienie domyślnego timeoutu - jeżeli jakiś element nie zostanie odnaleziony na stronie w tym czasie, to zwrócony zostanie wyjątek.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
