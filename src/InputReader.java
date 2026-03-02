import java.util.Scanner;

public class InputReader {

public static Scanner scanner = new Scanner(System.in);
static double number;
static char operation;

    private InputReader() {
    }

    public static void readNextDouble() {
        while (true) {
            try {
                String input = scanner.nextLine().trim().split(" ")[0];
                if (input.equals("exit")){
                    return;
                }
                number = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Некорректное число. Введите еще раз: ");
            }
        }
    }
    public static  void readNextOperation(){
        while (true) {
            String input = scanner.nextLine().trim().split(" ")[0];
            if (input.equals("exit")) {
                return;
            }
            if (input.isEmpty()) {
                System.out.println("Вы ничего не ввели. Введите операцию: ");
                continue;
            }
            operation = input.charAt(0);

            if (operation == '+' || operation == '-' ||
                    operation == '*' || operation == '/') {
                break;
            } else {
                System.out.println("Некорректный оператор. Введите еще раз: ");
            }
        }
    }

    public static  Double returnNumber(){
        return number;
    }
    public static  char returnOperator(){
        return operation;
    }



}

