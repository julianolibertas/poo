public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    //System.out.println("Pessoa: "+ this.nome + " | idade: " + this.idade);
  }

  public String pegaNome(){
    return nome;
  }

  protected int AumentaIdade(int aumento) {
    int novaIdade = idade + aumento;
    return novaIdade;
  }
}