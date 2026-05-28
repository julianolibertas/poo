public abstract class Empregado {
  private String nome;
  private int idade;
  public Empregado(){
  }
  public Empregado(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  public abstract double Ganha();
  
  public String getNome() {
    return nome;
  }
  public int getIdade() {
    return idade;
  }

  

}
