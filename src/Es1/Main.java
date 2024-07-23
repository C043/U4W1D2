package Es1;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String stringa = scanner.nextLine();
        System.out.println("Il numero di caratteri della stringa è pari? " + stringaPariDispari(stringa));

        System.out.println("Inserisci un anno:");
        int anno = parseInt(scanner.nextLine());
        System.out.println("L'anno è bisestile? " + annoBisestile(anno));

        scanner.close();
    }

    public static boolean stringaPariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 100 == 0) {
            return anno % 400 == 0 && anno % 4 == 0;
        } else return anno % 4 == 0;
    }
}
