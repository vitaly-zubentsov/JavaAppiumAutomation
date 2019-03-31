

public class MathHelper {

    public int calc(int a, int b, char action) {

        if (action == '+') {
            return this.plus(a,b);
        } else if (action == '-') {
            return this.minus(a,b);
        } else if (action == '*') {
            return this.myletiply(a,b);
        } else if (action == '/') {
             return this.divide(a,b);
        } else {
          return  this.typeAnErrorAndReturnDefaultValue("Wrong action: " + action);
        }
    }

    private int typeAnErrorAndReturnDefaultValue(String error_message) {
        System.out.println(error_message);
        return 0;
    }

    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int myletiply(int a, int b) {
        return a * b;
    }

    private int divide(int number, int divider) {
        if (divider == 0) {
             return this.typeAnErrorAndReturnDefaultValue("Cannot be divided by zero");
        } else {
            return number / divider;
        }
    }

}
