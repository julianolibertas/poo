public class Pessoa {
  String nome;
  int idade;
  public Pessoa(){
    System.out.println("Objeto Pessoa criado sem dados específicos");
  }
  public Pessoa(String nome){
    this.nome = nome;
    System.out.println("Pessoa criada com nome: "+ this.nome);
  }
  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    System.out.println("Pessoa: "+ this.nome + " | idade: " + this.idade);
  }
  
}
