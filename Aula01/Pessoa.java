public class Pessoa {
  String nome;
  int idade;

  void alteraNome(String novoNome){
    nome = novoNome;
  }
  String retornaNome() {
    return "Eae " + nome + ", tudo bão?";
  }
  int aumentaIdade(int aumento){
    int novaIdade = idade + aumento;
    return novaIdade;
  }
}
