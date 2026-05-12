package exercicio04;

public class Main {
  public static void main(String[] args) {
    Cidade cidade = new Cidade("Patolandia", "MG");
    Endereco endereco = new Endereco(
      "Rua Pimenta de Pádua", "350", "Centro", cidade);
    //instanciar Crianças
    Crianca zezinho = new Crianca("Zezinho", 8);
    Crianca luizinho = new Crianca("Luizinho", 8);
    Crianca huguinho = new Crianca("Huguinho", 8);
    Crianca patolino = new Crianca("Patolino", 14);

    // instanciar os responsáveis
    Responsavel donald = new Responsavel("Donald", "444.444.444-44", "donald@disney.com", endereco);
    Responsavel patinhas = new Responsavel("Patinhas", "555.555.555-55", "patinhas@disney.com", endereco);
    Responsavel margarida = new Responsavel("Margarida", "999.999.999-99", "donald@disney.com", endereco);
    // definir quem cuida de quem
    donald.adicionarCrianca(zezinho);
    donald.adicionarCrianca(luizinho);
    patinhas.adicionarCrianca(zezinho);
    patinhas.adicionarCrianca(huguinho);
    patinhas.adicionarCrianca(patolino);
    margarida.adicionarCrianca(zezinho);
  }
  
}
