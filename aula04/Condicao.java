import java.util.Scanner;

public class Condicao {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int x = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int y = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.println("'uc uem on' ao contrário: ");
        String r = c.nextLine();

        Scanner d = new Scanner(System.in);
        System.out.println("'arof ot' ao contrário: ");
        String n = d.nextLine();
        a.close();
        b.close();
        c.close();

        if (x > y) {
            System.out.println(x + " > " + y);
        } else if (x < y) {
            System.out.println(x + " < " + y);
        } else {
            System.out.println(x + " = " + y);
        }

        System.out.println("Rola " + r);
        System.out.println("bct " + n);
    }
}