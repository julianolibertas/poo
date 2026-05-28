package exercicio01;

public class ContaCorrente implements Conta {
  private double saldo;
  private double limite;
  public ContaCorrente(){
    this.saldo = 0.0;
    this.limite = Conta.limitePadrao;
  }
  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  public double getLimite() {
    return limite;
  }
  public void setLimite(double limite) {
    this.limite = limite;
  }
  public double verSaldo(){
    return this.saldo;
  }
  @Override
  public void deposito(double valor) {
    if (valor > 0){
      this.saldo += valor;
      System.out.println("Depósito de R$"+valor + " realizado na Conta Corrente");
    }
    
  }
  @Override
  public void imprimeSaldo() {
    System.out.println("Saldo Conta Corrente: "+ this.saldo + " | Limite disponível: R$"+ this.limite);
  }
  @Override
  public void saque(double valor) {
    if (valor <= this.saldo + this.limite){
      if (valor <= this.saldo){
        this.saldo -= valor;
      } else {
        double restante = valor - this.saldo;
        this.saldo = 0;
        this.limite -= restante;
      }
      System.out.println("Saque de R$"+ valor + " realizado na Conta Corrente.");
    } else {  
      System.out.println("Erro: Limite e saldo insuficiente na Conta Corrente.");
    }
    
  }
  
}
