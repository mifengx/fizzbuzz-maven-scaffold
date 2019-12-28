public class Fizz {
    public static String compute(int n) {
        if (n % 3 == 0) {

            return "Fizz";
        }
        if (n % 5== 0) {
            return "Buzz";
        }
        else{
            return String.valueOf(n);
        }
    }
}
