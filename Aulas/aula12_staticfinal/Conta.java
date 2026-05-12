public class Conta {
  private String dono;
  private double saldo;
  private double limite;
  public static int numAgencia;

  public Conta(String dono, double saldo, double limite){
    this.dono = dono;
    this.saldo = saldo;
    this.limite = limite;
  }

  public void exibirConta(){
    System.out.println("Dono: " + dono
                      + ", saldo: " + saldo
                      + ", limite: " + limite
                      + ", agencia: " + numAgencia
    );
  }

  public String getDono() {
    return dono;
  }

  public double getSaldo() {
    return saldo;
  }

  public double getLimite() {
    return limite;
  }
  
}
