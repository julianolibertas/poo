public class Producao extends Empregado {
  private double producao; // salário por produção
  private int quantidade;
  public Producao(String nome, int idade, double producao, int quantidade) {
    super(nome, idade);
    this.producao = producao;
    this.quantidade = quantidade;
  }

  public double Ganha(){
    return producao * quantidade;
  }
  
}
