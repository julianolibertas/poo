package animais;

public class Main {
  public static void main(String[] args) {
    // Pluto é cachorro (Mamifero)
    Cachorro pluto = new Cachorro("Pluto", 8, "Amarelo", "Bloodhound");

    Gato garfield = new Gato("Garfield", 10, "Laranja", "Persa");

    Aves lourojose = new Aves("Louro José", 20, "Papagaio", "Verde e amarelo");

    Peixes nemo = new Peixes("Nemo", 2, "Laranja e branco");

    System.out.println(pluto.getNome() + " | " 
                      + pluto.getIdade() + " | "
                      + pluto.getCorDoPelo() + " | "
                      + pluto.getRaca() );
    pluto.andar();
    pluto.latir();  

    System.out.println(garfield.getNome() + " | " 
                      + garfield.getIdade() + " | "
                      + garfield.getCorDoPelo() + " | "
                      + garfield.getRaca() );
    garfield.andar();
    garfield.miar();

    System.out.println(lourojose.getNome() + " | " 
                      + lourojose.getIdade() + " | "
                      + lourojose.getEspecie()
                      + lourojose.getCorDasPenas()
                       );
    lourojose.voar();

    System.out.println(nemo.getNome() + " | " 
                      + nemo.getIdade() + " | "
                      + nemo.getCorDasEscamas()
                       );
    nemo.nadar();
  }
}
