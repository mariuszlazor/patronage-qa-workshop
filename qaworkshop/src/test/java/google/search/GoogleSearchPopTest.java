package google.search;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.GoogleResultsPage;
import selenium.pages.GoogleSearchPage;

public class GoogleSearchPopTest extends TestBase {
    private final String queryText = "maven selenium webdriver";
    private final String expectedHref = "https://mvnrepository.com/artifact/org.seleniumhq.selenium";

    @Test
    public void performGoogleMavenSearch() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.search(queryText);
        GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);
        String firstSeachResultLinkValue = googleResultsPage.getSearchResultLinkValue(googleResultsPage.getResultElement(0));
        Assert.assertEquals(firstSeachResultLinkValue, expectedHref, "Maven repository is not the first search result.");
    }
}
