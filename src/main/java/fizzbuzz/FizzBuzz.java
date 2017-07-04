package fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzzOf(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }

}
