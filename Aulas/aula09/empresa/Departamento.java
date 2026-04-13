package empresa;

import java.util.ArrayList;

public class Departamento {
  public String descricao;
  // Associação: Lista para representar a multiplicidade 0..*
  public ArrayList<Funcionario> funcionarios;

  public Departamento() {
    this.funcionarios = new ArrayList<>(); //inicializa lista vazia
  }
  // Método para adicionar um funcionário ao departamento.
  public void admitirFuncionario(Funcionario f){
    this.funcionarios.add(f);
  }

  public void imprimirRelatorio() {
    System.out.println("Departamento: "+ this.descricao);
    System.out.println("Lista de funcionário");
    for (Funcionario f : funcionarios){
      System.out.println("- "+ f.nome + " R$ " +f.salario);
    } 
  }
  
}
