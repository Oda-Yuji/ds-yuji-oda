package pkg2aula01;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner nomeS = new Scanner(System.in);
        System.out.print("Insira o nome do usuário: ");
        String nome = nomeS.nextLine();
        
        Scanner emailS = new Scanner(System.in);
        System.out.print("Insira o email do usuário: ");
        String email = emailS.nextLine();
        
        Scanner idadeS = new Scanner(System.in);
        System.out.print("Insira a idade do usuário: ");
        int idade = idadeS.nextInt();
        
        Usuario usuario1 = new Usuario(nome, email, idade);
        
        usuario1.exibirInfo();
    }
}
