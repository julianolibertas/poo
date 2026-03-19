public class CalcResulte {
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    calc.numero1 = 10;
    calc.numero2 = 20;
    
    System.out.println("Soma: "+calc.somar());
    System.out.println("Subtrair: "+calc.subtrair());
    System.out.println("Multiplicação: "+calc.multiplicar());
    System.out.println("Divisão: "+calc.dividir());

    calc.numero1 = 55;
    calc.numero2 = 75;
    System.out.println("Multiplicação: "+calc.multiplicar());
    System.out.println("Divisão: "+calc.dividir());

  }
}
