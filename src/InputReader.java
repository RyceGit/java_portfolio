import java.util.Scanner;

//### Класс для работы с консолью ###
public class InputReader {
private Scanner scanner = new Scanner(System.in);;
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
                number = readDouble(input);
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
            operation = readOperator(input);

            if (operation == '+' || operation == '-' ||
                    operation == '*' || operation == '/') {
                break;
            } else {
                System.out.println("Некорректный оператор. Введите еще раз: ");
            }
        }
    }
    public static char readOperator(String allOperators){
        return allOperators.charAt(0);
    }
    public Double returnNumber(){
        return number;
    }
    public  Double readDouble(String string){
        return Double.parseDouble(string);
    }


}

