public class Main {
  public static void main(String[] args) {
    Empregado emp;

    emp = new Chefe("João", 55, 10000.00);
    System.out.println("O chefe ganha: " + emp.Ganha());
    emp = new Comissionario("Maria", 32, 1620.00, 3.00, 1500);
    System.out.println("O comissionário ganha: " + emp.Ganha());
    emp = new Producao("Pedro", 26, 2.5, 2000);
    System.out.println("Produção ganha: " + emp.Ganha());
    emp = new Horastrabalhada("Marta", 31, 13.75, 120);
    System.out.println("O horista ganha: " + emp.Ganha());

  }
}
