package Es2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 0 a 3");
        int num = parseInt(scanner.nextLine());
        stampaNumero(num);

        scanner.close();
    }

    public static void stampaNumero(int num) {
        switch (num) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Due");
            case 3 -> System.out.println("Tre");
            default -> System.out.println("Dovevi inserire un numero da 0 a 3!");
        }
    }
}
