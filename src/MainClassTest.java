import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {

        Assert.assertTrue("string from method getClassString() don't contain substring hello or Hello", (this.getClassString().contains("Hello") ) | (this.getClassString().contains("hello")));
    }
}
