import java.util.Scanner;

public class MainRetangulo {
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // --- Teste dos 3 Construtores ---
        Retangulo r1 = new Retangulo();
        r1.lado = 10;
        r1.altura = 20;
        System.out.println("Área r1: " + r1.calcularArea());

        Retangulo r2 = new Retangulo(25);
        r2.altura = 12;
        System.out.println("Área r2: " + r2.calcularArea());

        Retangulo r3 = new Retangulo(30, 40);
        System.out.println("Área r3: " + r3.calcularArea());

        // menu interativo
        System.out.println("\nDeseja digitar as medidas de um novo retângulo? (s/n) ");
        String resposta = leitor.next();

        if (resposta.equalsIgnoreCase("s")){
          System.out.println("Digite a largura (lado): ");
          double l = leitor.nextDouble();
          System.out.println("Digite a altura:");
          double a = leitor.nextDouble();
          Retangulo rUsuario = new Retangulo(l,a);
          System.out.println("Área do seu retangulo: " + rUsuario.calcularArea());
        } else {
          System.out.println("Programa encerrado.");
        }
        leitor.close();
  }
}
