public class Notas {
  private double prova01;
  private double prova02;
  private final double media;
  public Notas(double prova01, double prova02, double media){
    this.prova01 = prova01;
    this.prova02 = prova02;
    this.media = media;
  }
  public double getProva01() {
    return prova01;
  }
  public double getProva02() {
    return prova02;
  }
  public double getMedia() {
    return media;
  }

  public final void calculaMedia() {
    System.out.println((prova01+prova02)/2);
  }
  
}
