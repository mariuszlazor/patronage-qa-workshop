package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumBasicTest {

    @Test
    public void openBrowser() throws InterruptedException {
        //Utworzenie obiektu klasy CHromeOptions, w którym możemy ustawić różne opcje uruchamiania przeglądarki
        ChromeOptions options = new ChromeOptions();
        //Przekazanie do obiektu informacji, że będziemy korzystać z trybu incognito
        options.addArguments("--incognito");

        /*Utworzenie obiektu klasy WebDriver, który pozwala nam na połączenie się z przeglądarką. Wskazujemy tutaj, że korzystamy z przeglądarki Chrome,
        przekazujemy do obiektu ustawione opcje. Utworzenie takiego obiektu jets równoznaczne z otwarciem okna przeglądarki.
         */
        WebDriver driver = new ChromeDriver(options);
        //Maksymalizacja okna przeglądarki.
        driver.manage().window().maximize();
        //Wejście na stronę o podanym adresie
        driver.get("http://google.com");
        /*Zatrzymanie wątku na 2 sekundy - czasami przy pracy z Selenium używamy czegoś takiego, ale jest to ostateczność i powinniśmy tego unikać.
        Tutaj instrukcja pozwala nam zaobserwować otwarcie przeglądarki
         */
        Thread.sleep(2000);
        /*Zamknięcie okna przeglądarki i zabicie procesu przeglądarki - driver.close() zamyka tylko okno i zostawia proces aktywny*/
        driver.quit();
    }
}
