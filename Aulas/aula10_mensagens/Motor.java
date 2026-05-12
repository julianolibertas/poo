public class Motor {
  private String potencia;
  private String combustivel;
  private boolean ligado;

  public void ligar(){
    ligado = true;
    System.out.println("Motor ligado!");
  }
  public void desligar(){
    ligado = false;
    System.out.println("Motor desligado!");
  }
  public String getPotencia() {
    return potencia;
  }
  public void setPotencia(String potencia) {
    this.potencia = potencia;
  }
  public String getCombustivel() {
    return combustivel;
  }
  public void setCombustivel(String combustivel) {
    this.combustivel = combustivel;
  }
  public boolean isLigado() {
    return ligado;
  }
  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }
  
}
