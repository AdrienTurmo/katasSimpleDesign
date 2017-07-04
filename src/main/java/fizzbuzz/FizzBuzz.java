package fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzzOf(int number) {
        String resultOfFizzBuzz = "";

        resultOfFizzBuzz += ifDivisibleByThreeReturnFizz(number);
        resultOfFizzBuzz += ifDivisibleByFiveReturnBuzz(number);

        resultOfFizzBuzz = returnTheNumberIfNotDivisibleByThreeOrFive(number, resultOfFizzBuzz);

        return resultOfFizzBuzz;
    }

    private static String ifDivisibleByThreeReturnFizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return "";
    }

    private static String ifDivisibleByFiveReturnBuzz(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }
        return "";
    }

    private static String returnTheNumberIfNotDivisibleByThreeOrFive(int number, String resultOfFizzBuzz) {
        if (resultOfFizzBuzz.equals("")) {
            resultOfFizzBuzz = Integer.toString(number);
        }
        return resultOfFizzBuzz;
    }
}
