public class variaveis {
  public static void main(String[] args) {
    // tipo -> nome -> atribuir valor
    String nome = "Nome Aluno";
    System.out.println(nome);
    // Atribuição de variavel com outra
    String teste = "Teste";
    String testando = teste;
    System.out.println(testando);
    // inteiros
    int numero = 99999;
    long numeroGrande = 999_999_999_999_999l;
    System.out.println(numero);
    System.out.println(numeroGrande);
    //comentários
    // linha comentada
    /*
    linha 01
    linha 02
    */

    //concatenando
    String firstName = "Juliano";
    String lastName = "Caetano";
    System.out.println(firstName + " " + lastName);
    System.out.println("O nome dele é:" + firstName);
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
    
    // char
    char letra = 'A';
    System.out.println(letra);
    char letra2 = 64;
    System.out.println(letra2);
    char simbolo = '$';
    System.out.println(simbolo);

    int n = 42;
    System.out.println(n);
    System.out.println(n + 5);
    System.out.println(n * 10);
    System.out.println(n / 8);

    // float
    float pi = 3.1445454f;
    System.out.println(pi);
    // double
    double preco = 19.99;
    System.out.println(preco);
    System.out.println(preco - 12);
    System.out.println(preco / 2);
    System.out.println(10%3);
    
    int x = 5;
    x--;
    System.out.println(x);
    x += 5;
    System.out.println(x);

    // casting
    //implicito
    int numero2 = 42;
    long numeroLongo = numero2;
    double numeroDouble = numero2;
    System.out.println(numeroLongo);
    System.out.println(numeroDouble); 

    double valorDouble = 9.78;
    int valorInt = (int)valorDouble;
    System.out.println(valorInt + valorDouble);

    char letra3 = 'A';
    int codigoAscii = (int)letra3;
    System.out.println(codigoAscii);

    final int dias_da_semana = 7;
    System.out.println(dias_da_semana);
    var z = 10;
    System.out.println(z);
    var texto2 = "teste";
    
  }
}
