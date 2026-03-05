import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(51);
        System.out.println("Я загадал число от 1 до 50. Попробуй угадать!");
        System.out.println("Твоя догадка: ");

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true){
            i++;
            int myNumber = scanner.nextInt();

            if (myNumber < random) {
                System.out.println("Слишком мало!");
            }
            else if(myNumber > random) {
                System.out.println("Слишком много!");
            }
            else {
                System.out.println("Угадал! Ты справился с " + i + " попытки.");
                return;
            }
        }
    }
}
