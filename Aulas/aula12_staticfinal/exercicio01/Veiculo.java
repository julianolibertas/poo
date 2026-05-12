package exercicio01;

public class Veiculo {
  private String placa;
  private int anoFabricacao;
  private String marca;
  private String modelo;
  private double preco;
  private static final double percentual_ipva = 0.04;

  public Veiculo(String placa, int anoFabricacao, String marca, String modelo, double preco) {
    this.placa = placa;
    this.anoFabricacao = anoFabricacao;
    this.marca = marca;
    this.modelo = modelo;
    this.preco = preco;
  }
  
  public double calculaIPVA(){
    return preco*percentual_ipva;
  }

  @Override
  public String toString(){
    return String.format("Modelo: %s (%s) | Ano: %s | Placa: %s | Preço: R$%.2f | IVPA: R$%.2f",
      modelo, marca, anoFabricacao, placa, preco, calculaIPVA());
  }

  
}
