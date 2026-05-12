package veiculo;

public class Veiculo {
  private String marca;
  private double velocidade;
  public Veiculo(String marca, double velocidade){
    this.marca = marca;
    this.velocidade = velocidade;
  }
  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public double getVelocidade() {
    return velocidade;
  }
  
}
