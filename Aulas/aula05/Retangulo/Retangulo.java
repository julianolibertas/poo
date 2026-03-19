public class Retangulo {
  double lado1;
  double lado2;
  double area;
  double perimetro;

  // Calcula area e armazena no atributo, aceitando novos valores
  void calculaArea(double lado1, double lado2){
    this.lado1 = lado1;
    this.lado2 = lado2;
    area = lado1 * lado2;
  }
  // Calcula e retorna o perímetro com base no lados atuais
  double calculaPerimetro(){
    perimetro = 2 * (lado1 + lado2);
    return perimetro;
  }
}
