import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {

        /*
        input 1+1
        out 2
         */

        System.out.println("Введи выражение");
        Scanner scanner = new Scanner(System.in);
        String input = null;

        String parsedInteger = "";
        Character operator = Character.MIN_VALUE;
        int aggregate = 0;

        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                parsedInteger += c;
            }
            if (!Character.isDigit(c) || i == input.length() - 1) {
                int parsed = Integer.parseInt(parsedInteger);
                if (operator.equals(Character.MIN_VALUE)) {
                    aggregate = parsed;
                }
                if (!operator.equals(Character.MIN_VALUE))
                    switch (operator) {
                        case ('+'):
                            aggregate += parsed;
                            break;
                        case ('-'):
                            aggregate -= parsed;
                            break;
                        case ('*'):
                            aggregate *= parsed;
                            break;
                        case ('/'):
                            aggregate /= parsed;
                            break;
                    }
                parsedInteger = "";
                operator = c;
            }
        }
        System.out.println("Sum of " + input + ":\r\n" + aggregate);
    }

    static Integer calcSum(int a, int b) {
        return a + b;
    }
}
