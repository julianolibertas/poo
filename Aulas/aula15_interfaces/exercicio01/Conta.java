package exercicio01;

public interface Conta {
  public double limitePadrao = 100;
  public void imprimeSaldo();
  public void saque(double valor);
  public void deposito(double valor);
}
