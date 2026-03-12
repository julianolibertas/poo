public class Pessoa {
  String nome = "Paraíso";
  int idade;

  public Pessoa(String nomePessoa, int idadePessoa) {
    System.out.println("Sou um método construtor");
    this.nome = nomePessoa;
    this.idade = idadePessoa;

  }

  void alteraNome(String novoNome){
    nome = novoNome;
  }
  String retornaNome() {
    return "Eae " + nome + ", tudo bem?";
  }
  int aumentaIdade(int aumento){
    int novaIdade = idade + aumento;
    return novaIdade;
  }
}
