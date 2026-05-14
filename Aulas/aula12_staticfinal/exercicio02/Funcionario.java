package exercicio02;

public class Funcionario extends Pessoa {
  private double salario;
  private Cargo cargo;

  public Funcionario(String nome, int idade, double salario, Cargo cargo){
    super(nome, idade);
    this.salario = salario;
    this.cargo = cargo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    if (salario > 0){
      this.salario = salario;
    } else {
      System.out.println("Erro: Salário deve ser maior que zero");
      this.salario = 1.0;
    }
  }

  @Override
  public String toString(){
    return super.toString() + " | Salário:  R$"+salario+" | Cargo: " + cargo.getDescricao();
  }

  
}
