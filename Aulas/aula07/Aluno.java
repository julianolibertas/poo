public class Aluno {
  // atributos privados (encapsulamento)
  private String nome;
  private String telefone;
  private double nota1;
  private double nota2;
  private double media;
  private int faltas;

  public Aluno(String nome, String telefone){
    this.nome = nome;
    this.telefone = telefone;
    this.faltas = 0; //Inicializa falta como 0
  }

  // Lançar nota do aluno.
  public void lancarNota(double nota1, double nota2){
    if (nota1<=10 && nota2<=10){
      this.nota1 = nota1;
      this.nota2 = nota2;
    } else {
      this.nota1 = 0;
      this.nota2 = 0;
      System.out.println("Nota inválida!");
    }
    
  } 

  // Método protegido para adicionar faltas
  protected void adicionaFalta(){
    this.faltas += 1;  // soma + 1 na atributo falta
  }
  
  // lógica principal de cálculo de média
  public void calculaMedia(){
    // calculo base (nota1 + nota2) /2
    this.media = (this.nota1 + this.nota2)/2;
    //bônus da frequencia
    if (this.faltas == 0) {
      this.media += 1;
    } else if (this.faltas < 5) {
      this.media +=0.5;
    } 

    // regra de segurança: A média não deve ser maior que 10
    if (this.media > 10) {
      this.media =10;
    }
  }

  //Mostra todos os valores do objeto.
  public void exibirAluno(){
    System.out.println("--- Ficha do aluno ---");
    System.out.println("Nome: " + this.nome);
    System.out.println("Telefone: " + this.telefone);
    System.out.println("Nota 1: " + this.nota1);
    System.out.println("Nota 2: " + this.nota2);
    System.out.println("Faltas: " + this.faltas);
    System.out.println("Media final: " + this.media);
    System.out.println("-".repeat(25));
  }



}
