package fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzzOf(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }

}
