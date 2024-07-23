package Es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String stringa = scanner.nextLine();
        System.out.println("Il numero di caratteri della stringa è pari? " + PariDispari(stringa));
    }

    public static boolean PariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }
}
