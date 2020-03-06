package selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class TestCommons {
    protected void sendKeysToElement (WebElement element, String text) {
        element.sendKeys(text);
    }

    protected void clickElement (WebElement element) {
        element.click();
    }

    protected String getElementsAttribute (WebElement element, String attributeName) {
        return element.getAttribute(attributeName);
    }
    protected void initElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
