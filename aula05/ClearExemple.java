package aula05;

import java.util.Scanner;

public class ClearExemple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pica: ");
        String test = scan.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(test);
    }
}
