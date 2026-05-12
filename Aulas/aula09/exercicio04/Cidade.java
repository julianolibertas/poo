package exercicio04;

import java.util.ArrayList;

public class Cidade {
  private String nome;
  private String estado;
  private ArrayList<Endereco> endereco = new ArrayList<>();

  public Cidade(String nome, String estado) {
    this.nome = nome;
    this.estado = estado;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ArrayList<Endereco> getEndereco() {
    return endereco;
  }

  public void setEndereco(ArrayList<Endereco> endereco) {
    this.endereco = endereco;
  }

  
  
  
}
