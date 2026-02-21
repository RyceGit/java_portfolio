import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Введите первое число: ");
            Double firstNumber = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Ошибка! Нужно ввести число.");
        }


        System.out.println("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        Double secondNumber = scanner.nextDouble();


        double resualt = 0;

        switch (operation) {
            case '+' -> resualt = firstNumber + secondNumber;
            case '-' -> resualt = firstNumber - secondNumber;
            case '*' -> resualt = firstNumber * secondNumber;
            case '/' -> resualt = firstNumber / secondNumber;
            default -> {
                System.out.println("Ошибка: неверная операция или деление на ноль!");
                return;
            }

        };
        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + resualt);
    }
}



