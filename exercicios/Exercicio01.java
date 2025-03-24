import java.util.Scanner;

public class Exercicio01 
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Insira o nome do funcionário: ");
        String nameFun = a.nextLine();

        Scanner b = new Scanner(System.in);
        System.out.println("\nInsira o número de horas trabalhadas: ");
        int numH = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.println("\nInsira o valor recebido por hora: ");
        double valueH = c.nextDouble();

        Scanner d = new Scanner(System.in);
        System.out.println("\nInsira o número de filhos com menos de 14 anos de idade: ");
        int numChildren = d.nextInt();

        Scanner e = new Scanner(System.in);
        System.out.println("\nInsira a idade do funcionário: ");
        int age = e.nextInt();

        Scanner f = new Scanner(System.in);
        System.out.println("\nInsira op temo de serviço: ");
        int service = f.nextInt();

        Scanner g = new Scanner(System.in);
        System.out.println("\nInsira o salário família por filho: ");
        double salPerChild = g.nextDouble();

        a.close();
        b.close();
        c.close();
        d.close();
        e.close();
        f.close();
        g.close();

        double salBrute = numH * valueH;
        double discINPS = salBrute * 0.085;
        double salFamily = salPerChild * numChildren;
        double IR = 0;
        double adic = 0;

        if (salBrute >= 1500)
        {
            IR = salBrute * 0.15;
        }
        else if (salBrute > 500)
        {
            IR = salBrute * 0.08;
        }
        else if (salBrute <= 500)
        {
            IR = 0;
        }
        
        if (age > 40)
        {
            adic = salBrute * 0.02;
        }
        else if (service > 15)
        {
            adic = salBrute * 0.035;
        }
        else if (service <= 15)
        {
            if (age > 30)
            {
                adic = salBrute * 0.015;
            }
            else
            {
                adic = 0;
            }
        }

        double salLiq = salBrute - discINPS - IR + adic;

        System.out.println("O funcionário " + nameFun + " tem salário bruto de R$ " + salBrute + ", total de discontos de RS " + IR + discINPS + ", adicional de R$ " + adic + " e salário líquido de R$ " + salLiq + ".");
    }
}