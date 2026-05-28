package exercicio01;

public class Main2 {
  public static void main(String[] args) {
    Conta minhaPoupanca = new ContaPoupanca();
    Conta minhaCorrente = new ContaCorrente();

    minhaPoupanca.deposito(500.0);
    minhaPoupanca.saque(100.0);
    minhaPoupanca.imprimeSaldo();
    System.out.println("\n-------------------------------------");

    minhaCorrente.deposito(50);
    minhaCorrente.saque(120);
    minhaCorrente.imprimeSaldo();
    
  }
}
