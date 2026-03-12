import java.util.Scanner;

public class InputScanner {
  public static void main(String[] args) {
    // testando Scanner
    Scanner scanner = new Scanner(System.in);
    // Mensagem para o usuário entender o que precisar digitar
    System.out.println("Digite o seu nome: ");
    // resgata o valor do terminal
    String nome = scanner.nextLine();
    // exibe o valor
    System.out.println("Olá " + nome + "!");

    // NextInt
    System.out.println("Digite a idade: ");
    int idade2 = scanner.nextInt();
    System.out.println("Você tem " + idade2 + " anos.");

    // Problema do nextLine
    System.out.println("Digite um número: ");
    int n = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite o texto: ");
    String txt = scanner.nextLine();
    System.out.println("Os dados, n = " + n + " e txt = " + txt);

    scanner.close();

  }
}
