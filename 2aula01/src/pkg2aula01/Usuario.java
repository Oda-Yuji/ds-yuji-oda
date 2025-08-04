package pkg2aula01;

public class Usuario 
{
    // Atributos privados (encapsulamento)
    private String nome;
    private String email;
    private int idade;
    
    // Construtor: chamado ao criar um novo usuário
    public Usuario(String nome, String email, int idade)
    {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    
    // Getters e setters
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
        
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getIdade()
    {
        return idade;
    }
    public void setIdade(int indade)
    {
        this.idade = idade;
    }
    
    public void exibirInfo()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
    }
}
