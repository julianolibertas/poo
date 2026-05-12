package exercicio03;

public class Aluno {
  private String nome;
  private double nota1;
  private double nota2;
  private int faltas;

  public Aluno(String nome, double nota1, double nota2, int faltas) {
    this.nome = nome;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.faltas = faltas;
  }

  public double calcularMedia(){
    return (nota1 + nota2)/2;
  }
  public boolean estaAprovado(){
    return (calcularMedia() >= 70 && faltas < 20);
  }
  public String getNome() {
    return nome;
  }
  public int getFaltas() {
    return faltas;
  }
  
  
  

}
