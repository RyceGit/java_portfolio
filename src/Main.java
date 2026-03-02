public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("Ведите первое число: ");
            InputReader.readNextDouble();
            double firstNumber = InputReader.returnNumber();

            System.out.println("Ведите оператор(+, -, *, /): ");
            InputReader.readNextOperation();
            char operator = InputReader.returnOperator();

            System.out.println("Ведите второе число: ");
            double secondNumber;
            while (true) {
                try {
                    InputReader.readNextDouble();
                    secondNumber = InputReader.returnNumber();
                    double result = Calculator.calculate(operator, firstNumber, secondNumber);
                    System.out.println("Результат: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Делить на ноль нельзя, введите число еще раз: ");
                    continue;
                }
                break;
            }
        } while (!Exit.isConfirm());

    }
}
