import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1. Polacz z infolinia");
        System.out.println("2. Zakoncz");

        System.out.print("Wybierz opcje: ");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();


        switch (result) {
            case 1:
                System.out.println("Wybrano opcje nr: " + result);
                // connect to server
                break;
            case 2:
                System.out.println("Wybrano opcje nr: " + result);
                break;
            // quit
            default:
                System.out.println("Nie wlasciwa opcja");
        }
    }
}
