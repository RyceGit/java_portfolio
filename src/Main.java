import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputReader firstNumber = new InputReader();
        System.out.println("Введите первое число: ");
        firstNumber.readNextDouble();
        System.out.println(firstNumber.returnNumber());

        InputReader operation = new InputReader();
        System.out.println("Введите оператор: ");
        operation.readNextOperation();
        System.out.println(operation.returnOperator());

        InputReader secondNumber = new InputReader();
        System.out.println("Введите первое число: ");
        secondNumber.readNextDouble();
        System.out.println(secondNumber.returnNumber());


        double result = Calculator.calculate(operation.returnOperator(), firstNumber.returnNumber(),secondNumber.returnNumber());
        System.out.println(result);

//TODO:
    }
}
