package exercicio01;

public class ContaPoupanca implements Conta {
  private double saldo;
  public ContaPoupanca(){
    this.saldo = 0.0;
  }
  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  public double verSaldo(){
    return this.saldo;
  }
  @Override
  public void deposito(double valor) {
    if (valor > 0){
      this.saldo += valor;
      System.out.println("Depósito de R$"+valor + " realizado na poupança");
    }
    
  }
  @Override
  public void imprimeSaldo() {
    System.out.println("Saldo da Poupança: "+ this.saldo);
  }
  @Override
  public void saque(double valor) {
    if (valor <= this.saldo){
      this.saldo -= valor;
      System.out.println("Saque de R$"+ valor + " realizado na Poupança.");
    } else {  
      System.out.println("Erro: Saldo insuficiente na Poupança.");
    }
    
  }
  
  


  
}
