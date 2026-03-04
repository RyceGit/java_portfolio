public class Exit {


    public static boolean isConfirm() {

        System.out.println("Выйти? 'да/нет': ");
        String confirmation = InputReader.scanner.nextLine().trim();
        return confirmation.equalsIgnoreCase("да");

    }
}

