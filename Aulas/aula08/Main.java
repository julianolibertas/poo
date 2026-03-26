import Cafeteira.Cafeteira;
import Pessoa.Pessoa;

public class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    p1.setNome("Fulano");
    p1.setIdade(33);
    System.out.println("Nome: "+p1.getNome()+", idade: " + p1.getIdade());

    Cafeteira minhaCafeteira = new Cafeteira();
    //tentado fazer café sem ligar e sem suprimento
    minhaCafeteira.fazerCafe();

    // Preparando a máquina
    minhaCafeteira.ligar();
    minhaCafeteira.reporAgua(300);
    minhaCafeteira.reporCafe(30);
    //agora sim
    minhaCafeteira.fazerCafe();
    minhaCafeteira.fazerCafe();
    minhaCafeteira.fazerCafe();

    minhaCafeteira.desligar();

  }
}
