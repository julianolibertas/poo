package exercicio02;

public class Calculadora {
  /*
  somar 2 números inteiros
  somar 2 números double
  somar 2 número String (faça a conversão de tipo)
  somar 3 números inteiros
  somar 4 números inteiros
  somar 2 números inteiros e 2 números double
  */
  public int somar(int a, int b){
    return a + b;
  }
  public double somar(double a, double b){
    return a + b;
  }

  public double somar(String a, String b){
    double n1 = Double.parseDouble(a);
    double n2 = Double.parseDouble(b);
    return n1 + n2;
  }

  public int somar(int a, int b, int c){
    return a + b + c;
  }

  public int somar(int a, int b, int c, int d){
    return a + b + c + d;
  }

  public double somar(int a, int b, double c, double d){
    return a + b + c + d;
  }
}
