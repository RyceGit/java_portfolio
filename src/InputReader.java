import java.util.Scanner;

//### Класс для работы с консолью ###
public class InputReader {
private final Scanner scanner;
double number;
char operation;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public void readNextDouble() {
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
    public void readNextOperation(){
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

    public Double returnNumber(){
        return number;
    }
    public char returnOperator(){
        return operation;
    }



}

