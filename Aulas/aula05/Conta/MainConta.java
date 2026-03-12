public class MainConta {
  public static void main(String[] args) {
    Conta minhaConta = new Conta();

    System.out.println("Dono: "+minhaConta.dono);
    System.out.println("Saldo inicial: "+minhaConta.verificaSaldo());

    minhaConta.deposito(500);
    minhaConta.saque(100);
    minhaConta.aumentaLimite(50);

    System.out.println("Saldo: "+minhaConta.verificaSaldo());
    System.out.println("Limite: "+minhaConta.verificaLimite());
  }
}
