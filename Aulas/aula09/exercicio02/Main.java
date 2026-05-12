package exercicio02;

public class Main {
  public static void main(String[] args) {
    // criando o endereço compartilhado
    Endereco ruaDisney = new Endereco("Rua da Disney", 200);
    // criar clientes
    Cliente c1 = new Cliente("Huguinho");
    Cliente c2 = new Cliente("Zezinho");
    Cliente c3 = new Cliente("Luizinho");
    // Vincular para cada o mesmo endereço
    c1.vincularEndereco(ruaDisney);
    c2.vincularEndereco(ruaDisney);
    c3.vincularEndereco(ruaDisney);
    // testamos o método imprimir da classe endereço
    System.out.println("### Relatório de Ocupação ###");
    ruaDisney.imprimir();
    // Criar um endereço sem ninguém
    Endereco ruaVazia = new Endereco("Avenida Fantasma", 0);
    ruaVazia.imprimir();
  }
}
