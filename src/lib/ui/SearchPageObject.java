package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.List;

public class SearchPageObject extends MainPageObject {

    private static final String
            SEARCH_INIT_ELEMENT = "//*[contains(@text,'Search Wikipedia')]",
            SEARCH_INPUT = "//*[contains(@text,'Search…')]",
            SEARCH_CANCEL_BUTTON = "org.wikipedia:id/search_close_btn",
            SEARCH_RESULT_BY_SUBSTRING_TITLE_TPL = "//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='{SUBSTRING}']",
            SEARCH_RESULT_BY_SUBSTRINGS_TITLE_AND_DESCRIPTION_TPL = "//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='{TITLE}']//..//*[@text='{DESCRIPTION}']",
            SEARCH_RESULT_ELEMENT = "//*[@resource-id='org.wikipedia:id/search_results_container']//*[@resource-id='org.wikipedia:id/page_list_item_container']",
            SEARCH_EMPTY_RESULT_ELEMENT = "//*[@text='No results found']",
            SEARCH_EMPTY_IMAGE = "org.wikipedia:id/search_empty_image",
            SEARCH_RESULT_ELEMENTS = "//*[@resource-id='org.wikipedia:id/page_list_item_title']";


    public SearchPageObject(AppiumDriver driver) {

        super(driver);
    }

    /* TEMPLATES METHODS */
    private static String getResultSearchElementByTitle(String substring) {

        return SEARCH_RESULT_BY_SUBSTRING_TITLE_TPL.replace("{SUBSTRING}", substring);
    }

    private static String getResultSearchElementByTitleAndDescription(String title, String description) {

        return SEARCH_RESULT_BY_SUBSTRINGS_TITLE_AND_DESCRIPTION_TPL.
                replace("{TITLE}", title).
                replace("{DESCRIPTION}", description);
    }
    /* TEMPLATES METHODS */

    public void initSearchInput() {

        this.waitForElementAndClick(By.xpath(SEARCH_INIT_ELEMENT), "Cannot find and click search init element", 5);
        this.waitForElementPresent(By.xpath(SEARCH_INIT_ELEMENT), "Cannot find search input after clicking search init element");

    }

    public void typeSearchLine(String search_line) {

        this.waitForElementAndSendKeys(
                By.xpath(SEARCH_INPUT),
                search_line,
                "Cannot find and type into search input",
                5
        );
    }

    public void waitForSearchResult(String substring) {

        String search_result_xpath = getResultSearchElementByTitle(substring);
        this.waitForElementPresent(
                By.xpath(search_result_xpath),
                "Cannot find search result with substring " + substring
        );
    }

    public void waitForCancelButtonToAppear() {

        this.waitForElementPresent(
                By.id(SEARCH_CANCEL_BUTTON),
                "Cannot find search cancel button",
                5
        );
    }

    public void waitForCancelButtonToDisappear() {

        this.waitForElementNotPresent(
                By.id(SEARCH_CANCEL_BUTTON),
                "Search cancel button is still present",
                5);
    }

    public void clickCancelSearch() {

        this.waitForElementAndClick(
                By.id(SEARCH_CANCEL_BUTTON),
                "Cannot find and click search cancel button",
                5
        );

    }

    public void clickByArticleWithSubstring(String substring) {

        String search_result_xpath = getResultSearchElementByTitle(substring);
        this.waitForElementAndClick(By.xpath(search_result_xpath), "Cannot find and click search result with substring " + substring, 10);
    }

    public int getAmountOfFoundArticles() {


        this.waitForElementPresent(
                By.xpath(SEARCH_RESULT_ELEMENT),
                "Cannot find anything by the request - ",
                15
        );
        return this.getAmountOfElements(By.xpath(SEARCH_RESULT_ELEMENT));
    }

    public void waitForEmptyResultsLabel() {

        this.waitForElementPresent(
                By.xpath(SEARCH_EMPTY_RESULT_ELEMENT),
                "Cannot find empty result element ",
                15
        );
    }

    public void assertThereIsNoResultOfSearch() {


        this.assertElementNotPresent(
                By.xpath(SEARCH_RESULT_ELEMENT),
                "We supposed not to find any results"
        );
    }


    public void waitForEmptySearchImage() {
        waitForElementPresent(
                By.id(SEARCH_EMPTY_IMAGE),
                "Result list of search is still present on the page",
                5
        );
    }

    public List getResultListOfSearch() {

        return waitForElementsIsPresentAndGetListOfThem(
                By.xpath(SEARCH_RESULT_ELEMENTS),
                "Result List Of Search is not present",
                5);
    }

    public int getQuantityOfResultList(){

        return getResultListOfSearch().size();
    }

    public void waitForElementByTitleAndDescription(String title, String description) {

        String search_result_xpath = getResultSearchElementByTitleAndDescription(title,description);
        waitForElementPresent(
                By.xpath(search_result_xpath),
                "Result element with title " + title + " and description " + description + " is not present",
                5);
    }

}
