package exercicio01;

public class Pessoa {
  private String nome;
  private int idade;
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    setIdade(idade);
  }

  public String toString(){
    return "Nome: " + nome + ", idade: " + idade;
  }
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    if (idade >= 0 && idade <=120){
      this.idade = idade;
    } else {
      System.out.println("Erro: Idade inválida! ");
      this.idade = 0;
    }
  }
  

}
