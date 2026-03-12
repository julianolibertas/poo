public class Time {
  String time;
  String corCamisa;
  int classificacao;

  public Time(String nomeTime){
    this.time = nomeTime;
    this.corCamisa = "Branca";
    this.classificacao = 99;
  }

  // Metodo auxiliar para exibir os dados do time
  void exibirDados(){
    System.out.println("=".repeat(40));
    System.out.println("Time: " + time);
    System.out.println("Cor da camisa: " + corCamisa);
    System.out.println("Classificação: " + classificacao);
    System.out.println("=".repeat(40));


  }

}
