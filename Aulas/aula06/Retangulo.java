public class Retangulo {
  // atributos da Classe
  public double lado;
  public double altura;

  // 1 - construtor padrão.
  public Retangulo(){
    // inicializa com valores padrão se necessário
  }
  // 2 - Sobrecarga com 1 paramentro (lado)
  public Retangulo(double lado){
    this.lado = lado;
  }
  // 3 - sobrecarga com 2 parametros (lado e altura)
  public Retangulo(double lado, double altura){
    this.lado = lado;
    this.altura = altura;
  }
  // Metodo para calcular área
  public double calcularArea(){
    return this.lado * this.altura;
  }
}
