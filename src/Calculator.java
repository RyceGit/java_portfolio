public class Calculator {

    public static double calculate(char operation, double firstNumber, double secondNumber){
        double result;
        switch (operation) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0){
                    throw new ArithmeticException("Ошибка оператора");
                } else {
                     result = firstNumber / secondNumber;
                }
            }
                default -> throw new IllegalStateException("Ошибка оператора");
        }
        return result;
    }
}
