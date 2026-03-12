public class Conta {
  String dono = "Fulano";
  int numero = 123;
  double saldo = 0;
  double limite = 100;

  //diminui Saldo
  void saque (double quantidade){
    saldo = saldo - quantidade;
  }
  //aumenta Saldo
  void deposito(double quantidade) {
    saldo = saldo + quantidade;
  }
  // retorna o saldo atual
  double verificaSaldo(){
    return saldo; 
  }
  // retorna o limite atual
  double verificaLimite(){
    return limite;
  }
  //altera o valor do limite para um novo valor específico
  void alteraLimite(double novoLimite){
    this.limite = novoLimite; 
  }
  // soma um valor ao limite atual
  void aumentaLimite(double quantidade){
    limite += quantidade;
  }
  //subtrai um valor do limite atual
  void diminuiLimite(double quantidade){
    limite -= quantidade;
  }
}
