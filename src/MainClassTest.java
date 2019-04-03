import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber() {

        Assert.assertTrue("number from method getClassNumber() < 46", this.getClassNumber() > 45);
    }
}
