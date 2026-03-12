package aula04;

import java.util.Scanner;

public class MainVeiculo {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Veiculos meuCarro = new Veiculos();

    System.out.println("--- Cadastro de veículos ---");
    System.out.print("Digite a marca: ");
    meuCarro.marca = leitor.nextLine();
    System.out.print("Digite o modelo: ");
    meuCarro.modelo = leitor.nextLine();
    System.out.print("Digite a placa: ");
    meuCarro.placa = leitor.nextLine();
    System.out.print("Digite o ano de fabricação: ");
    meuCarro.anoFabricacao = leitor.nextInt();
    System.out.print("Digite o valor do veículo: ");
    meuCarro.valor = leitor.nextDouble();
    System.out.println(" --- Resultados --- ");
    System.out.println("Veículo: "+ meuCarro.marca + " " + meuCarro.modelo);
    System.out.println("Idade do veículo: " + meuCarro.calculaIdade() + " anos");

    // Formatando para exibir apenas 2 casas decimais uso printf
    System.out.printf("Valor do IPVA: R$ %.2f%n", meuCarro.valorIPVA());
    System.out.printf("Valor do Seguro: R$ %.2f%n", meuCarro.valorSeguro());
    
    leitor.close();

  }
}
