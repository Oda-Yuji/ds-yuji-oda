import java.util.Scanner;

public class Exercicio02
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Insira o código do funcionário: ");
        int code = a.nextInt();
        
        Scanner b = new Scanner(System.in);
        System.out.println("\nInsira tempo de serviço do funcionário: ");
        int service = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.println("\nInsira o sexo do funcionário\nFeminino(F)         Masculino(M): ");
        char sex = c.next().charAt(0);

        Scanner d = new Scanner(System.in);
        System.out.println("\nInsira o salário do funcionário: ");
        double salFun = d.nextDouble();

        a.close();
        b.close();
        c.close();
        d.close();

        double bonus = 0;

        if (sex == 'M')
        {
            if (service > 15)
            {
                bonus = salFun * 0.2;
            }
            else
            {
                bonus = 100;
            }
        }
        else if (sex == 'F')
        {
            if (service > 10) 
            {
                bonus = salFun * 0.25;
            }
            else
            {
                bonus = 100;
            }
        }
        else
        {
            System.out.println("Você é um helicóptero?");
        }

        System.out.println("O valor do bônus deste funcionário é de R$ " + bonus + ".");
    }    
}
