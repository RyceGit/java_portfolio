import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ### Переменные ###
        double firstNumber;
        double secondNumber;
        char operation;
        double result = 0;
        String exit;


        // ### Сканер ###
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выхода в любой момент введите 'exit'");
        while (true) {
            // ### Работа с первым числом ###
            System.out.println("Введите первое число: ");
            while (true) {
                try {
                    String input = scanner.nextLine().trim().split(" ")[0];
                    if (input.equals("exit")){
                        return;
                    }
                    firstNumber = readDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректное число. Введите еще раз: ");
                }
            }
            // ### Работа с оператором ###
            System.out.println("Введите операцию (+, -, *, /): ");
            while (true) {
                    String input = scanner.nextLine().trim().split(" ")[0];
                    if (input.equals("exit")) {
                        return;
                    }
                    if (input.isEmpty()) {
                        System.out.println("Вы ничего не ввели. Введите операцию: ");
                        continue;
                    }
                    operation = readOperator(input);

                    if (operation == '+' || operation == '-' ||
                            operation == '*' || operation == '/') {
                        break;
                    } else {
                        System.out.println("Некорректный оператор. Введите еще раз: ");
                    }
            }
            // ### Работа со вторым числом ###
            System.out.println("Введите второе число: ");
            while (true) {
                try {
                    String input = scanner.nextLine().trim().split(" ")[0];
                    if (input.equals("exit")){
                        return;
                    }
                    secondNumber = readDouble(input);
                    //### Деление на ноль ###
                    if (operation == '/' && secondNumber == 0) {
                        System.out.println("Нельзя делить на ноль. Введите другое число: ");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректное число. Введите еще раз: ");
                }

            }
            // ### Подсчет ###
            result = calculate(operation, firstNumber,secondNumber);
            // ### Вывод ответа ###
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);

            // ### Выход и подтверждение ###
            while (true) {
                System.out.println("Продолжить? (да/нет): ");
                exit = scanner.nextLine().trim();
                if (exit.equals("да")) {
                    break;
                }  if (exit.equals("нет") || exit.equals("exit")) {
                    return;
                }
            }
        }
    }

    //    ### Парсинг из стринга в дабл ###
    public static Double readDouble(String string){
        return Double.parseDouble(string);
    }
    public static char readOperator(String allOperators){
        return allOperators.charAt(0);
    }
    public static double calculate ( char operation, double firstNumber, double secondNumber){
        double result;
        switch (operation) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
            default -> throw new IllegalStateException("Ошибка оператора");
        }
        return result;
    }
}
