public class Fizz {
    public static String compute(int n) {
        String s = "";
        if (n < 0) {
            throw new IllegalArgumentException("wrong input");
        }
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                s = "FizzBuzz";
            }
            if (n % 7 == 0) {
                s = "FizzWhizz";
            }
            s = "Fizz";
        }
        if (n % 5 == 0) {
            if (n % 7 == 0) {
                s = "BuzzWhizz";
            }
            s = "Buzz";
        }
        if (n % 7 == 0) {
            s = "Whizz";
        } else {
            s = String.valueOf(n);
        }
        return s;
    }
}
