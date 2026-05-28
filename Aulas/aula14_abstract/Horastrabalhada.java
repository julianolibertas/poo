public class Horastrabalhada extends Empregado{
  private double valor;
  private double horas;
  public Horastrabalhada(String nome, int idade, double valor, double horas) {
    super(nome, idade);
    this.valor = valor;
    this.horas = horas;
  }

  public double Ganha(){
    return valor * horas;
  }
  


}
