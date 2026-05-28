package exercicio02;

public class Main {
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    System.out.println("--- Testando Sobrecarga da Calculadora ---");
    System.out.println("2 inteiros: " + calc.somar(10, 20));
    System.out.println("2 doubles: " + calc.somar(10.5, 20.3));
    System.out.println("2 string: " + calc.somar("50", "30"));
    System.out.println("3 inteiros: " + calc.somar(1, 2, 3));
    System.out.println("4 inteiros: " + calc.somar(1, 2, 3, 4));
    System.out.println("2 inteiros e 2 double: " + calc.somar(10, 20, 10.5, 20.3));
  }
}
