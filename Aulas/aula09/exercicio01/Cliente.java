package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nome;
  private String telefone;
  //Associação: Um cliente pode possuir muitos (*) pedidos
  private List<Pedido> pedidos;

  public Cliente(String nome, String telefone){
    this.nome = nome;
    this.telefone = telefone;
    this.pedidos = new ArrayList<>();
  }
  // método para associar um novo pedido a este cliente
  public void adicionarPedido(Pedido p) {
    this.pedidos.add(p);
  }
  public void imprimirExtrato(){
    System.out.println("-".repeat(40));
    System.out.println("Cliente: " + nome + " | Fone: "+telefone);
    System.out.println("=== PEDIDOS REALIZADOS ===");
    double totalGeral = 0;
    for (Pedido p : pedidos){
      double totalItem = p.calcularTotalPedido();
      System.out.println("- " + p.getProduto() + " Qtd: "+p.getQuantidade() +
      " | Un: " + p.getPreco() + " | Total: R$ "+ totalItem
    );
    totalGeral += totalItem;
  }
  System.out.println("TOTAL ACUMULADO: R$ " + totalGeral);
  System.out.println("-".repeat(40));


  }

}
