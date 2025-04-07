import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        ArrayList<Integer> sortSides = new ArrayList<Integer>();

        Scanner Sa = new Scanner(System.in);
        System.out.println("Insira o lado A: ");
        int aSide = Sa.nextInt();
        sortSides.add(aSide);

        Scanner Sb = new Scanner(System.in);
        System.out.println("Insira o lado B: ");
        int bSide = Sb.nextInt();
        sortSides.add(bSide);

        Scanner Sc = new Scanner(System.in);
        System.out.println("Insira o lado C: ");
        int cSide = Sc.nextInt();
        sortSides.add(cSide);

        Sa.close();
        Sb.close();
        Sc.close();

        Collections.sort(sortSides, Collections.reverseOrder());

        int a = sortSides.get(0);
        int b = sortSides.get(1);
        int c = sortSides.get(2);

        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("\nIsto não pode ser um triângulo.");
        } else {
            if (a > b + c) {
                System.out.println("\nIsto não pode ser um triângulo.");
            } else {
                if (a2 == b2 + c2) {
                    System.out.println("\nOs lados representam um triângulo retângulo.");
                }
                if (a2 > b2 + c2) {
                    System.out.println("\nOs lados representam um triângulo obtusângulo.");
                }
                if (a2 < b2 + c2) {
                    System.out.println("\nOs lados representam um triângulo acutângulo");
                }
                if (a == b && b == c) {
                    System.out.println("\nOs lados representam um triângulo equilátero.");
                } else if (a == b || a == c || b == c) {
                    System.out.println("\nOs lados representam um triângulo isósceles.");
                }
            }
        }
    }
}
