package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nome;
  private List<Endereco> enderecos;

  public Cliente(String nome){
    this.nome = nome;
    this.enderecos = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }
  public void vincularEndereco(Endereco e){
    this.enderecos.add(e);
    e.adicionarMorador(this); // Mantém a relação bilateral
  }
}
