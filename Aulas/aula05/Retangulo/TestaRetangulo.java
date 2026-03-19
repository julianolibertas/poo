public class TestaRetangulo {
  public static void main(String[] args) {
    // instancio a classe
    Retangulo novoRetangulo = new Retangulo();

    novoRetangulo.lado1 = 10;
    novoRetangulo.lado2 = 5;

    novoRetangulo.calculaArea(10,5);
    System.out.println("Área: " + novoRetangulo.area);
    System.out.println("Perímetro: " + novoRetangulo.calculaPerimetro());

    novoRetangulo.lado2 = 7;

    novoRetangulo.calculaArea(novoRetangulo.lado1, novoRetangulo.lado2);
    System.out.println("Área: " + novoRetangulo.area);
    System.out.println("Perímetro: " + novoRetangulo.calculaPerimetro());


  }
}
