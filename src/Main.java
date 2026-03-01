import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputReader first = new InputReader();
        System.out.println("Введите первое число: ");
        first.readNextDouble();
        System.out.println(first.returnNumber());
    }
}
