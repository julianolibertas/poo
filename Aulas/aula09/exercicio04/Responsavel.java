package exercicio04;

import java.util.ArrayList;

public class Responsavel {
  private String nome;
  private String cpf;
  private String email;
  private Endereco endereco;
  private ArrayList<Crianca> crianca = new ArrayList<>();
  
  public Responsavel(String nome, String cpf, String email, Endereco endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.endereco = endereco;
  }

  public void adicionarCrianca(Crianca c) {
    this.crianca.add(c);
    c.responsaveis.add(this);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public ArrayList<Crianca> getCrianca() {
    return crianca;
  }

  public void setCrianca(ArrayList<Crianca> crianca) {
    this.crianca = crianca;
  }

  


  



  
}
