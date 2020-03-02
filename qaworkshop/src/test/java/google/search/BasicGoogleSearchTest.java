package google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BasicGoogleSearchTest {
    //Deklaracja pól klasy, w jednym z nich będziemy trzymać nasze "połączenie" z przeglądarką, w drugim adres, pod który chcemy się dostać
    private WebDriver driver;
    private final String url = "https://google.com";

    /* Metoda oznaczona @BeforeClass jest uruchamiana przed pierwszym testem w klasie, jeżeli mielibyśmy jeszcze metodę oznaczoną @BeforeMethod,
    to najpierw zostanie odpalona metoda @BeforeClass, a później @BeforeMethod
     */
    @BeforeClass
    private void setUp() {
        /*Ustawienie ścieżki do chromedriver - dopóki odpalamy testy w IntelliJ, to to nie jest nam potrzebne, po IDE samo w jakiś sposób ogarnia sobie podłączenie do przeglądarki,
        ale bez tego test wywaliłby nam się przy jego uruchomieniu z poziomu konsoli.
         */
        System.setProperty("webdriver.chrome.driver","C:\\qaworkshop\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //Ustawienie domyślnego timeoutu - jeżeli jakiś element nie zostanie odnaleziony na stronie w tym czasie, to zwrócony zostanie wyjątek.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    //Po wykonanym teście ubijamy przeglądarkę
    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    //Test polegający na wyszukaniu frazy w google i sprawdzenu linku pierwszego wyniku
    @Test
    public void googleSearchTest() {
        driver.get(url);
        //Sprawdzenie, czy tytuł strony zgadza się z naszymi oczekiwaniami
        Assert.assertEquals(driver.getTitle(), "Google", "Invalid page title.");
        /*Odnalezienie elementu na stronie po selektorze css (pole tekstowe na google.com) i wpisanie w nim frazy wyszukiwania.
        Elementów możemy również szukać m.in. po ich atrybucie name, class, id oraz xpath, którego powinniśmy używać w ostateczności,
        ponieważ szukanie po xpath jest po prostu najwolniejsze.
        */
        driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys("maven selenium webdriver");
        /*Kliknięcie przycisku wyszukiwania*/
        driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.tfB0Bf > center > input.gNO89b")).click();
        //Definiujemy oczekiwany link, w sumie można by to spokojnie umieścić jako pole klasy
        final String expectedHref = "https://mvnrepository.com/artifact/org.seleniumhq.selenium";
        //Pobieramy atrybut href pierwszego elementu w wynikach wyszukiwania
        final String href = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div:nth-child(1) > div > div > div.r > a")).getAttribute("href");
        //Sprawdzamy, czy link, który pobraliśmy ze strony zgadza się z tym, czego oczekiwaliśmy
        Assert.assertEquals(href, expectedHref, "Maven repository is not the first search result.");
    }


}
