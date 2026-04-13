package empresa;

public class Main {
  public static void main(String[] args) {
    Departamento dep = new Departamento();
    dep.descricao = "Tecnologia de informação";
    // Criando funcionários
    Funcionario f1 = new Funcionario("Alice", 5000.0);
    Funcionario f2 = new Funcionario("Bob", 4500.0);
    Funcionario f3 = new Funcionario("Carol", 6000.0);

    // Associando os funcionários ao departamento(O relacionamento 0..*)
    dep.admitirFuncionario(f1);
    dep.admitirFuncionario(f2);
    dep.admitirFuncionario(f3);
    // Exibir resultado
    dep.imprimirRelatorio();

  }
}
