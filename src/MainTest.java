import org.junit.Test;

public class MainTest extends CoreTestCase{

   MathHelper Math = new MathHelper();

    @Test
    public void myFirstTest() {

        int a = Math.calc(5,4,'+');
        System.out.println(a);

        int b = Math.calc(5,0,'-');
        System.out.println(b);

        int c = Math.calc(5,4,'0');
        System.out.println(a);

        int d = Math.calc(5,0,'/');
        System.out.println(b);
    }




}
