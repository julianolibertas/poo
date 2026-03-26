package Pessoa;

public class Pessoa {
  private String nome;
  private int idade;

  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return nome; 
  }

  public void setIdade(int idade){
    if (idade < 0) {
      this.idade = 0;
    } else {
      this.idade = idade; 
    }
  }
  public int getIdade(){
    return idade;
  }
}
