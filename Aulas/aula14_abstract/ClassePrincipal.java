public class ClassePrincipal {
  public static void main(String[] args) {
    Chefe cf = new Chefe("João", 55, 10000.00);
    Comissionario cm = new Comissionario("Maria", 32, 1620.00, 3.00, 1500);
    Producao prod = new Producao("Pedro", 26, 2.5, 2000);
    Horastrabalhada hr = new Horastrabalhada("Marta", 31, 13.75, 120);

    System.out.println("O chefe ganha: " + cf.Ganha());
    System.out.println("O comissionário ganha: " + cm.Ganha());
    System.out.println("Produção ganha: " + prod.Ganha());
    System.out.println("O horista ganha: " + hr.Ganha());
    

  }
}
