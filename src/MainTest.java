import org.junit.Test;

public class MainTest extends CoreTestCase {

    MathHelper Math = new MathHelper();

    @Test
    public void myFirstTest() {

        System.out.println("First test : Before changing static_int: " + MathHelper.static_int);

        MathHelper.static_int = 8;

        MathHelper mathObject = new MathHelper();
        System.out.println("First test : Before changes simple_int: " + mathObject.simple_int);
        mathObject.simple_int = 8;

    }


    @Test
    public void mySecondTest() {

        System.out.println("Second test : Before changing static_int: " + MathHelper.static_int);

        MathHelper.static_int = 8;

        MathHelper mathObject = new MathHelper();
        System.out.println("Second test : Before changes simple_int: " + mathObject.simple_int);
        mathObject.simple_int = 8;

    }


}
