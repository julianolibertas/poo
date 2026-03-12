public class Calculadora {
  //Atributos
  int numero1;
  int numero2;

  //metodos da operação
  int somar(){
    return numero1 + numero2;
  }
  int subtrair(){
    return numero1 - numero2;
  }
  int multiplicar(){
    return numero1 * numero2;
  }
  double dividir(){
    if (numero2==0){
      System.out.println("Erro: Divisão por zero!");
      return 0;
    }
    return (double) numero1/numero2; // Faz a conta com decimais
  }
  
}
