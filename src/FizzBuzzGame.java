import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FizzBuzzGame {
    static final HashMap<Integer, String> RULES = new HashMap<>() {{
        put(3, "Fizz");
        put(5, "Buzz");
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int start = scanner.nextInt();
        final int end = scanner.nextInt();

        for (int number = start; number <= end; number++) {
            System.out.println(generateFizzBuzz(number));
        }
    }

    public static String generateFizzBuzz(int number) {
        String output = "";

        for (Map.Entry<Integer, String> entry : RULES.entrySet()) {
            if (number % entry.getKey() == 0) {
                output += entry.getValue();
            }
        }

        return output.length() > 0 ? output.toString() : String.valueOf(number);
    }
}