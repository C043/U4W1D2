package Es3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String stringa = scanner.nextLine();
        while (!stringa.equals(":q")) {
            for (int i = 0; i < stringa.length(); i++) {
                System.out.println(stringa.charAt(i));
                if (i == stringa.length() - 1) continue;
                System.out.println(",");
            }
            System.out.println("Inserisci un altra stringa o :q per uscire");
            stringa = scanner.nextLine();
        }
        scanner.close();
    }
}