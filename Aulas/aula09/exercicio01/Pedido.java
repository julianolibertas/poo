package exercicio01;

public class Pedido {
  private String produto;
  private int quantidade;
  private double preco;

  public Pedido(String produto, int quantidade, double preco){
    this.produto = produto;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  public String getProduto() {return produto;}
  public int getQuantidade() {return quantidade;}
  public double getPreco() {return preco;}

  // método para calcular o total de pedido específico.
  public double calcularTotalPedido(){
    return this.quantidade * this.preco;
  }

  

}
