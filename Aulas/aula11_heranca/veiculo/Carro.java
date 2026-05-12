package veiculo;

public class Carro extends Veiculo {
  private int numPort;
  public Carro (String marca, double velocidade, int numPort){
    super(marca, velocidade);
    this.numPort = numPort;
  }
  public int getNumPort() {
    return numPort;
  }
  public void setNumPort(int numPort) {
    this.numPort = numPort;
  }
  
}
