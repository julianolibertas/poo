public class Main {
  public static void main(String[] args) {
    Pessoa pessoa;
    pessoa = new Pessoa();
    pessoa.nome = "Fulano";
    pessoa.idade = 20;
    System.out.println("Olá " + pessoa.nome);
    System.out.println("Sua idade é " + pessoa.idade);
    pessoa.alteraNome("Juliano");
    System.out.println("Olá " + pessoa.nome);

    Pessoa pessoa2;
    pessoa2 = new Pessoa();
    pessoa2.nome = "Maria";
    pessoa2.idade = 55;
    pessoa2.retornaNome();
    System.out.println(pessoa2.retornaNome());



  }
}
