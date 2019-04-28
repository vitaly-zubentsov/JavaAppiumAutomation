package lib.ui;

import io.appium.java_client.AppiumDriver;

public class WelcomePageObject extends MainPageObject {

    private static final String
            STEP_LEARN_MORE_LINK = "id:Learn more about Wikipedia",
            STEP_NEW_WAYS_TO_EXPLORE_TEXT = "id:New ways to explore",
            STEP_ADD_OR_EDIT_PREFERRED_LANG_LINK = "id:Add or edit preferred languages",
            STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_LINK = "id:Learn more about data collected",
            NEXT_LINK = "id:Next",
            SKIP = "id:Skip",
            GET_STARTED_BUTTON = "id:Get started";

    public WelcomePageObject(AppiumDriver driver) {

        super(driver);
    }

    public void waitForLearnMoreLink() {

        this.waitForElementPresent(
                STEP_LEARN_MORE_LINK,
                "Cannot find 'Learn more about Wikipedia'",
                10
        );
    }

    public void clickNextButton() {

        this.waitForElementAndClick(
                NEXT_LINK,
                "Cannot find and click 'Next' link",
                10)
        ;
    }

    public void waitForNewWayToExploreText() {

        this.waitForElementPresent(
                STEP_NEW_WAYS_TO_EXPLORE_TEXT,
                "Cannot find 'New ways to explore'",
                10
        );
    }

    public void waitForAddOrEditPreferredLangText() {

        this.waitForElementPresent(
                STEP_ADD_OR_EDIT_PREFERRED_LANG_LINK,
                "Cannot find 'Add or edit preferred languages'",
                10
        );
    }

    public void waitForLearnMoreAboutDataCollectedText() {

        this.waitForElementPresent(
                STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_LINK,
                "Cannot find 'Learn more about data collected'",
                10
        );
    }

    public void clickGetStartedButton() {

        this.waitForElementAndClick(
                GET_STARTED_BUTTON,
                "Cannot find and click 'Get started' link",
                10
        );
    }


    public void clickSckip() {

        this.waitForElementAndClick(
                SKIP,
                "cannot find and click skip button",
                5
        );
    }
}
