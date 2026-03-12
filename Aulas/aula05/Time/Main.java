public class Main {
  public static void main(String[] args) {
    // Instanciando um novo time
    Time meuTime = new Time("Java Futebol Clube");
    meuTime.exibirDados();

    meuTime.classificacao = 1;
    meuTime.exibirDados();

    Time meuTime2 = new Time("Libertas futebol clube");
    meuTime2.corCamisa = "Branca e Preta";
    meuTime2.classificacao = 2;
    meuTime2.exibirDados();

    
    
  }
  
}
