import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean flag = true;
        while (flag){
            try{
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
                                case '+':
                                    aggregate += parsed;
                                    System.out.println("Sum of " + input + ":\r\n" + aggregate);
                                    break;
                                case '-':
                                    aggregate -= parsed;
                                    System.out.println("Sum of " + input + ":\r\n" + aggregate);
                                    break;
                                case '*':
                                    aggregate *= parsed;
                                    System.out.println("Sum of " + input + ":\r\n" + aggregate);
                                    break;
                                case '/':
                                    aggregate /= parsed;
                                    System.out.println("Sum of " + input + ":\r\n" + aggregate);
                                    break;
                                default:
                                    System.out.println("Пашол нахуй");
                            }
                        parsedInteger = "";
                        operator = c;
                    }
                }
            }catch (Exception e){
                System.out.println("Ответ отрицательный");
            }finally{
                System.out.println("Доебать калькулятор? y/n");
                    Scanner scanner1 = new Scanner(System.in);
                    String input1 = scanner1.next();
                    String input2 = input1.trim().toLowerCase(Locale.ROOT);
                    char symbolic = input2.charAt(0);
                    switch (symbolic){
                        case 'y':
                            break;
                        case 'n':
                            flag = false;
                            break;
                        default:
                            System.out.println("Нет так нет.");
                            flag = false;
                    }
            }
        }
    }
}
