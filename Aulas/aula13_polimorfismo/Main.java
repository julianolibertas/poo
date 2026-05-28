public class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa(); //vazio
    p1.setPeso(70);
    p1.setAltura(1.75);

    Pessoa p2 = new Pessoa("Donald");
    Pessoa p3 = new Pessoa("Patinhas", 80);
    Pessoa p4 = new Pessoa("Margarida", 25, 1.60, 55.0);

    System.out.println("IMC p1 (atributos internos): " + p1.calculaIMC());

    double imcExterno = p2.calculaIMC(90, 1.80);
    System.out.println("IMC do " + p2.getNome() + " (parametros externos): "+ imcExterno);
    System.out.println(p3.getNome());
    System.out.println(p4.getNome());

  }
}
