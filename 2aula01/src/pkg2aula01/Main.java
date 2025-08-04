package pkg2aula01;

public class Main 
{
    public static void main(String[] args) 
    {
        Usuario usuario1 = new Usuario("Yuji", "torres1109@gmail.com", 16);
        
        usuario1.exibirInfo();
        
        usuario1.setNome("Felipe");
        
        System.out.println("\nApós a alteração do nome: ");
        usuario1.exibirInfo();
    }
}
