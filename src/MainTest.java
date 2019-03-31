import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends CoreTestCase {

    @Before
    public void textStartTest() {
        System.out.println("Start test");
    }

    @Test
    public void myFirstTest() {
        System.out.println("firstTest");
    }

    @Test
    public void mySecondTest() {
        System.out.println("secondTest");
    }

    @After
    public void textFinishTest() {
        System.out.println("Finish test");
    }


}
