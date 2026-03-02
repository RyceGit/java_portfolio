public class Calculator {

    public  double calculate ( char operation, double firstNumber, double secondNumber){
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
