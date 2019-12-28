public class Fizz {
    public static String compute(int n) {
        if(n<0){
            throw new IllegalArgumentException("wrong input");
        }
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                return "FizzBuzz";
            }
            if (n % 7 == 0) {
                return "FizzWhizz";
            }
            return "Fizz";
        }
        if (n % 5 == 0) {
            if (n % 7 == 0) {
                return "BuzzWhizz";
            }
            return "Buzz";
        }
        if (n % 7 == 0) {
            return "Whizz";
        } else {
            return String.valueOf(n);
        }
    }
}
