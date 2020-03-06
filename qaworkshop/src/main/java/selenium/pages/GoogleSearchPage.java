package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.base.TestCommons;

public class GoogleSearchPage extends TestCommons {

    @FindBy(css = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")
    public WebElement searchInput;

    @FindBy(css = "#tsf > div:nth-child(2) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.tfB0Bf > center > input.gNO89b")
    public WebElement submitButton;

    @FindBy(id = "nonExistingElement")
    public WebElement x;

    public GoogleSearchPage(WebDriver driver) {
        //PageFactory.initElements(driver, this);
        initElements(driver);
    }

    public void sendKeysToSearchInput(String text){
        sendKeysToElement(searchInput, text);
    }

    public void clickSubmitButton() {
        clickElement(submitButton);
    }

    public void search(String text) {
        sendKeysToSearchInput(text);
        clickSubmitButton();
    }
}
