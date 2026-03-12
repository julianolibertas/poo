package aula02;

public class Aluno {
  String nome;
  double nota1;
  double nota2;
  double media;

  // metodo para calcular a média aritmética
  public void calcularMedia() {
    this.media = (nota1 + nota2) /2;
  }

  // metodo auxiliar para exibir os dados do aluno
  public void exibirInformacoes(){
    System.out.println("Nome: " + nome);
    System.out.println("Nota 1: "+ nota1);
    System.out.println("Nota 2: "+ nota2);
    System.out.println("Média final: " + media);
    System.out.println("-".repeat(50));
  }
}
