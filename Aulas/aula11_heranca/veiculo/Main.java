package veiculo;

public class Main {
  public static void main(String[] args) {
    Carro car1 = new Carro("Porche", 300, 2);
    System.out.println("O carro: " + car1.getMarca() 
                      + " chega até a " + car1.getVelocidade()
                      + "Km/h e a quantidade portas é " 
                      + car1.getNumPort());
    
    Moto moto1 = new Moto("Titan", 110, "Pequena");
    System.out.println("A moto: " + moto1.getMarca() 
                      + " chega até a " + moto1.getVelocidade()
                      + "Km/h e o tamanho é " + 
                      moto1.getTamanho());

  }
}
