public class Carro {
  private String marca;
  private String modelo;
  private Motor motor = new Motor();
  public Carro(){

  }
  public void andar() {
    motor.ligar();
    System.out.println("Carro andando...");
  }
  public void parar(){
    System.out.println("O carro parou!");
    motor.desligar();
  }
  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  
}
