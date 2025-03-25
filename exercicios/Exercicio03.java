import java.util.Scanner;

public class Exercicio03 
{
    public static void main(String[] args) 
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Insira o lado C: ");
        int cSide = c.nextInt();
        
        Scanner b = new Scanner(System.in);
        System.out.println("Insira o lado B: ");
        int bSide = b.nextInt();

        Scanner a = new Scanner(System.in);
        System.out.println("Insira o lado A (este deve ser maior ou igual a B e C): ");
        int aSide = a.nextInt();

        a.close();
        b.close();
        c.close();

        int a2 = aSide * aSide;
        int b2 = bSide * bSide;
        int c2 = cSide * cSide;
        
        if (aSide < bSide || aSide < cSide)
        {
            System.out.println("Você sabe ler?");
        }
        else
        {
            if (aSide > bSide + cSide)
            {
                System.out.println("\nIsto não pode ser um triângulo.");
            }
            if (a2 == b2 + c2)
            {
                System.out.println("\nOs lados representam um triângulo retângulo.");
            }
            if (a2 > b2 + c2)
            {
                System.out.println("\nOs lados representam um triângulo obtusângulo.");
            }
            if (a2 < b2 + c2)
            {
                System.out.println("\nOs lados representam um triângulo acutângulo");
            }
            if (aSide == bSide && bSide == cSide)
            {
                System.out.println("\nOs lados representam um triângulo equilátero.");
            }
            else if (aSide == bSide || aSide == cSide || bSide == cSide)
            {
                System.out.println("\nOs lados representam um triângulo isósceles.");
            }
        }
    }
}
