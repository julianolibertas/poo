package exercicio01;

public class Main {
  public static void main(String[] args) {
    // cliente Donald
    Cliente donald = new Cliente("Donald Duck", "1234-5566");
    // criando 2 pedidos
    Pedido p1Donald = new Pedido("Marinheiro G", 1, 150);
    Pedido p2Donald = new Pedido("Boia de pato", 2,45);
    donald.adicionarPedido(p1Donald);
    donald.adicionarPedido(p2Donald);

    // cliente Patinhas
    Cliente patinhas = new Cliente("Tio Patinhas", "8888-9999");
    // criando 3 pedidos
    Pedido p1Patinhas = new Pedido("Moeda de ouro", 10, 1000.00);
    Pedido p2Patinhas = new Pedido("Cartola de luxo", 1, 500.00);
    Pedido p3Patinhas = new Pedido("Bengala de Marfim", 1, 1200.00);
    patinhas.adicionarPedido(p1Patinhas);
    patinhas.adicionarPedido(p2Patinhas);
    patinhas.adicionarPedido(p3Patinhas);

    System.out.println("===== SISTEMA DE VENDAS ======");

    // donaldo 2 pedidos
    donald.imprimirExtrato();
    System.out.println();
    // patinhas 3 pedidos
    patinhas.imprimirExtrato();

  }
}
