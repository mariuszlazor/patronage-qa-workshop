package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.base.TestCommons;

import java.util.List;

public class GoogleResultsPage extends TestCommons {

    @FindBy(className = "g")
    public List<WebElement> searchResults;

    String searchResultLinkXpath = ".//div/div/div/a";

    public GoogleResultsPage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
        initElements(driver);
    }

    public GoogleResultsPage() {

    }

    public WebElement getResultElement(int number) {
        return searchResults.get(number);
    }

    public String getSearchResultLinkValue(WebElement element) {
        //return element.findElement(By.xpath(searchResultLinkXpath)).getAttribute("href");
        return getElementsAttribute(element.findElement(By.xpath(searchResultLinkXpath)), "href");
    }
}
