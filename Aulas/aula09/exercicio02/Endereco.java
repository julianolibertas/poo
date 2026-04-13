package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Endereco {
  private String logradouro;
  private int numero;
  private List<Cliente> moradores;

  public Endereco(String logradouro, int numero){
    this.logradouro = logradouro;
    this.numero = numero;
    this.moradores = new ArrayList<>();
  }
  public void adicionarMorador(Cliente c){
    if (!moradores.contains(c)){
      this.moradores.add(c);
    }
  }
  public void imprimir(){
    System.out.println("Endereço: " + logradouro + ", n. "+numero);
    System.out.println("Moradores: ");
    if (moradores.isEmpty()){
      System.out.println("Nenhum morador cadastrado.");
    } else {
      for (int i=0;i<moradores.size();i++){
        System.out.println(moradores.get(i).getNome() + 
        (i< moradores.size()-1?", ":""));
      }
      System.out.println();
    }
    System.out.println("-".repeat(40));
  }

}
