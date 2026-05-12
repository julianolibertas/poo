package exercicio01;

public class Main {
  public static void main(String[] args) {
    // Criar o Veículo
    Veiculo meuCarro = new Veiculo("ABC-4455", 2025, "Toyota", "Corolla", 150000.0);

    // Criar Motorista
    Motorista motora = new Motorista("Pateta", 150, "E");
    // Estabelecer a associação 1:1
    motora.setVeiculo(meuCarro);

    // Testando o toString
    System.out.println("=== Dados do Sistema ===");
    System.out.println(motora.toString());



  }
}
