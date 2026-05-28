public class Pessoa {
  private String nome;
  private int idade;
  private double altura;
  private double peso;

  public Pessoa() {}

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public Pessoa(String nome, int idade) {
    this.nome = nome;
  }

  public Pessoa(String nome, int idade, double altura, double peso) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
  }

  public double calculaIMC(double peso, double altura) {
    return peso / (altura * altura);
  }

  public double calculaIMC() {
    //return calculaIMC(this.peso, this.altura);
    return peso / (altura * altura);
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  
}
