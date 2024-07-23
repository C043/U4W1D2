package Es4;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conto alla rovescia a partire da?");
        int num = parseInt(scanner.nextLine());
        contoAllaRovesca(num);
        scanner.close();
    }

    public static void contoAllaRovesca(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
