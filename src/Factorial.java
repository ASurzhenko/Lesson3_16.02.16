/**
 * Created by User on 16.02.2016.
 */
public class Factorial {
    public static void main(String[] args) {

        int factorisl = 1;
        int i = 5;

        while (i > 0) {
            factorisl *= i;
            i--;
        }
        System.out.println("Result is " + factorisl);
    }
}
