public class Main {
  public static void main(String[] args) {
    Conta.numAgencia = 133;
    Conta c01 = new Conta("Juliano", 100, 1000);
    Conta c02 = new Conta("Fulano", 1500, 10000);
    c01.exibirConta();
    Conta.numAgencia = 9955;
    c02.exibirConta();
    //------------------------------------------
    String texto = "120";
    int numero = Integer.parseInt(texto);
    System.out.println(numero);
    
    
  }
}
