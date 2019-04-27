package exercise;

import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Ex9 extends CoreTestCase {

    @Test
    public void testForExercise4() {

        String searchWord = "JAVA";
        SearchPageObject SearchPageObject = new SearchPageObject(driver);

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine(searchWord);
        List<WebElement> result_list = SearchPageObject.getResultListOfSearch();

        for (WebElement element : result_list) {
            assertTrue(
                    "Result of search don't contain search word = " + searchWord,
                    element.getText().toLowerCase().contains(searchWord.toLowerCase())
            );
        }

        assertTrue(
                "Quantity of ResultSearchList is less than 2",
                result_list.size() > 1
        );

    }
}
