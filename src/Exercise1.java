/**
 * Created by User on 16.02.2016.
 */
public class Exercise1 {
    public static void main(String[] args) {

        int amount = 85;
        String rating = "good";

        switch (rating) {
            case "terrible":
                break;
            case "good":
                amount += amount * 0.05;
                break;
            case "nice":
                amount += amount * 0.1;
                break;
            default:
                amount += amount * 0.2;
        }
        System.out.println(amount);
    }
}
