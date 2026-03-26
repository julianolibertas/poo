package Cafeteira;

public class Cafeteira {
  // atributos privados(encapsulamento - ninguém acessa direto)
  private boolean ligada;
  private int nivelAgua;
  private int nivelCafe;
  //construtor: A cafeteira já nasce com alguns suprimentos
  public Cafeteira(){
    this.ligada = false;
    this.nivelAgua = 0;
    this.nivelCafe = 0;
  }
  //botão ligar
  public void ligar(){
    this.ligada = true;
    System.out.println("Cafeteira ligada. Aquecendo...");
  }
  //botão desligar
  public void desligar(){
    this.ligada = false;
    System.out.println("Cafeteira desligada..");
  }
  //repor suprimentos
  public void reporAgua(int quantidade){
    this.nivelAgua += quantidade;
    System.out.println("Água reposta: " + quantidade + "ml");
  }
  public void reporCafe(int quantidade){
    this.nivelCafe += quantidade;
    System.out.println("Café reposto: " + quantidade + "g");
  }

  // Fazer o café (A lógica principal)
  public void fazerCafe(){
    if (!ligada) {
      System.out.println("Erro: A cafeteira está desligada");
      return;
    }
    if (nivelAgua>=100 && nivelCafe >=15){
      System.out.println("Passando café... o cheirinho está ótimo!");
      this.nivelAgua -= 100;
      this.nivelCafe -= 15;
    } else {
      System.out.println("Erro: Verifique os suprimentos (água ou café insuficientes)");
    }
  }


}
