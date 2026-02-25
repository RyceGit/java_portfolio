import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ### Переменные ###
        double firstNumber;
        double secondNumber;
        char operation;
        double result;
        String exit;

        // ### Сканер ###
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // ### Работа с первым числом ###
            System.out.println("Введите первое число: ");
            while (true) {
                try {
                    String input = scanner.nextLine().split(" ")[0];
                    if (input.equals("exit")){
                        return;
                    }
                    firstNumber = Double.parseDouble(input);
                    break;
                } catch (Exception e) {
                    System.out.println("Некорректное число. Введите еще раз: ");
                }

            }
            // ### Работа с оператором ###
            System.out.println("Введите операцию (+, -, *, /): ");
            while (true) {
                try{
                    String input = scanner.nextLine().split(" ")[0];
                    if (input.equals("exit")){
                        return;
                    }
                    operation = input.charAt(0);
                    if (operation == '+' || operation == '-' ||
                            operation == '*' || operation == '/') {
                        break;
                    } else {
                        System.out.println("Некорректный оператор. Введите еще раз: ");
                    }
                }catch (Exception e){
                    System.out.println("Пустой ввод. Введите оператор (+, -, *, /): ");
                }


            }
            // ### Работа со вторым числом ###
            System.out.println("Введите второе число: ");
            while (true) {
                try {
                    String input = scanner.nextLine().split(" ")[0];
                    if (input.equals("exit")){
                        return;
                    }
                    secondNumber = Double.parseDouble(input);
                    //### Деление на ноль ###
                    if (operation == '/' && secondNumber == 0) {
                        System.out.println("Нельзя делить на ноль. Введите другое число: ");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Некорректное число. Введите еще раз: ");
                }

            }
            // ### Операции ###
            switch (operation) {
                case '+' -> result = firstNumber  + secondNumber;
                case '-' -> result = firstNumber  - secondNumber;
                case '*' -> result = firstNumber  * secondNumber;
                case '/' -> result = firstNumber  / secondNumber;
                default -> throw new IllegalStateException("Ошибка оператора");
            }
            // ### Вывод ответа ###
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);

            // ### Выход и подтверждение ###
            while (true) {
                System.out.println("Продолжить? (да/нет): ");
                exit = scanner.nextLine();
                if (exit.equals("да")) {
                    break;
                }  if (exit.equals("нет")) {
                    return;
                }
            }
        }
    }
}
