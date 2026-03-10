import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int maxNumber = 0;
        int attempts = 0;
        String exit;
        int bestScore = Integer.MAX_VALUE;
        int countRounds = 0;
        int countWin = 0;


        do {
// ### Выбор уровня сложности ###
            System.out.println("""
                    Перед началом игры выберете уровень:
                    - Легкий: число от 1 до 30, 10 попыток
                    - Средний: число от 1 до 100, 7 попыток
                    - Сложный: число от 1 до 1000, 10 попыток
                    Уровень:\s""");
            String levelGame = scanner.nextLine().toLowerCase(Locale.ROOT);

            switch (levelGame) {
                case "легкий" -> {
                    maxNumber = 30;
                    attempts = 10;
                }
                case "средний" -> {
                    maxNumber = 100;
                    attempts = 7;
                }
                case "сложный" -> {
                    maxNumber = 1000;
                    attempts = 10;
                }
            }

// ### Загадывание и угадывание числа ###
            int i = 0;
            int myNumber;
            int random = rand.nextInt(maxNumber) + 1;

            System.out.println("Я загадал число от 1 до " + maxNumber + ". Попробуй угадать!");
            do {
                System.out.println("Осталось попыток: " + (attempts - i));
                System.out.println("Твоя догадка: ");
                i++;
                myNumber = scanner.nextInt();
                if (myNumber < random) {
                    System.out.println("Слишком мало!");
                } else if (myNumber > random) {
                    System.out.println("Слишком много!");
                } else {
                    System.out.println("Угадал! Ты справился с " + i + " попытки.");
                    countWin++;
                    break;
                }
                bestScore = Math.min(bestScore, attempts);
            } while (i < attempts);
            countRounds ++;
            if (myNumber != random) {
                System.out.println("Вы проиграли, загаданное число: " + random);
            }
// ### Лучший рез-т ###
            System.out.println("Лучший рез-тат: " + bestScore + " попыток; Раундов: " + countRounds + "; Побед: " + countWin);
// ### Очистка буфера после nextInt() ###
            scanner.nextLine();
// ### Подтверждение выхода ###
            System.out.println("Играть ещё? (да/нет)");
            exit = scanner.nextLine();
        } while (exit.equalsIgnoreCase("да"));

    }
}
