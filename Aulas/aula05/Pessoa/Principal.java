public class Principal {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Fulano",20);
    //pessoa.nome = "Fulano";
    pessoa.idade = 20;
    System.out.println("Olá " + pessoa.nome);
    System.out.println("Sua idade é " + pessoa.idade);
    pessoa.alteraNome("Juliano");
    System.out.println("Olá " + pessoa.nome);
    System.out.println(pessoa.retornaNome());
    System.out.println("Sua idade é " + pessoa.aumentaIdade(35));

    Pessoa p2 = new Pessoa("Libertas", 50);
    //p2.nome = "Ceduc";
    System.out.println("Olá " + p2.nome);
    System.out.println("Sua idade é " + p2.idade);

   
    


  }
  
}
