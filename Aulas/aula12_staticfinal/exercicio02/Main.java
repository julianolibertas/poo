package exercicio02;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    LinkedList<Funcionario> listaFuncionarios = new LinkedList<>();
    Scanner leitor = new Scanner(System.in);
    int opcao = 0;
    while (opcao !=3) {
      System.out.println("\n--- MENU ---");
      System.out.println("1 - Inserir funcionário");
      System.out.println("2 - Listar todos");
      System.out.println("3 - Sair");
      System.out.println("Escolha uma opção: ");
      opcao = leitor.nextInt();
      leitor.nextLine();  //limpar cache
      if (opcao == 3) {
        System.out.println("Saindo do sistema...");
      } else {
        System.out.println("Opção inválida!");
      }
      
    }
    leitor.close();
  }
}
