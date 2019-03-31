import org.junit.Test;

public class MainTest {

    int a = 5;
    int b = 11;

    @Test
    public void myFirstTest() {

        int a = this.myltiply(5);
        System.out.println(a);

        int b = this.myltiply(10,15);
        System.out.println(b);
    }



    public int myltiply(int number) {
        return number * 2;
    }

    public int myltiply(int number, int multiplier) {
        return number * multiplier;
    }
}
