import java.util.Scanner;

//### Класс для работы с консолью ###
public class InputReader {
private Scanner scanner = new Scanner(System.in);;
double number;

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
    public Double returnNumber(){
        return number;
    }
    public  Double readDouble(String string){
        return Double.parseDouble(string);
    }


}
