public class Main {
    public static void main(String[] args) {
        System.out.println("Ведите первое число: ");
        InputReader.readNextDouble();
        double firstNumber = InputReader.returnNumber();

        System.out.println("Ведите оператор(+, -, *, /): ");
        InputReader.readNextOperation();
        char operator = InputReader.returnOperator();

        System.out.println("Ведите второе число: ");
        InputReader.readNextDouble();
        double secondNumber = InputReader.returnNumber();

        System.out.println("Результат: ");
        double result = Calculator.calculate(operator,firstNumber,secondNumber);
        System.out.println(result);



    }
}
