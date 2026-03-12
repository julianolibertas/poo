public class Pessoa2 {
  String nome;
  int idade;

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
