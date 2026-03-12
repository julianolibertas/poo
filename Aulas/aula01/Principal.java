package aula01;

public class Principal {
  public static void main(String[] args) {
    Pessoa pessoa;
    pessoa = new Pessoa();
    pessoa.nome = "Fulano";
    pessoa.idade = 20;
    System.out.println("Olá " + pessoa.nome);
    System.out.println("Sua idade é " + pessoa.idade);
    pessoa.alteraNome("Juliano");
    System.out.println("Olá " + pessoa.nome);
    System.out.println(pessoa.retornaNome());
    System.out.println("Sua idade é " + pessoa.aumentaIdade(35));

    Pessoa pessoa2;
    pessoa2 = new Pessoa();
    


  }
  
}
