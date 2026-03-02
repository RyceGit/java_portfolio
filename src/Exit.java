import java.util.Scanner;

public class Exit {
    public static Scanner scanner = new Scanner(System.in);
    public void Exit(){
        System.out.println("Выйти? 'да/нет': ");

        String confirmation = scanner.nextLine();
        if (confirmation == "да"){
            return break;
        }else {
            return ;
        }


    }
}
