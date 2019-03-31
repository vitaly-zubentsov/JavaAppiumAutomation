import org.junit.Test;

public class MainTest extends CoreTestCase{

   MathHelper Math = new MathHelper();

    @Test
    public void myFirstTest() {

        int a = Math.myltiply(5);
        System.out.println(a);

        int b = Math.myltiply(10,15);
        System.out.println(b);
    }




}
