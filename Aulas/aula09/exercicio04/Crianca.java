package exercicio04;

import java.util.ArrayList;

public class Crianca {
  private String nome;
  private int idade;
  public ArrayList<Responsavel> responsaveis = new ArrayList<>();

  public Crianca(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Responsavel> getResponsaveis() {
    return responsaveis;
  }

  public void setResponsaveis(ArrayList<Responsavel> responsaveis) {
    this.responsaveis = responsaveis;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  
}
