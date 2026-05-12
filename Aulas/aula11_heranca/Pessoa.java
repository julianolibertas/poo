public class Pessoa {
  private String nome;
  private int idade;
  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  public void falar(){
    System.out.println("falar alto!");
  }
  public String getNome() {
    return nome;
  }
  public int getIdade() {
    return idade;
  }
  
}
