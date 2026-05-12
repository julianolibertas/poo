package animais;

public class Peixes extends Animais {
    private String corDasEscamas;

    public Peixes(String nome, int idade, String corDasEscamas){
        super(nome, idade);
        this.corDasEscamas = corDasEscamas;
    }
    public void nadar(){
        System.out.println("Está nadando...");
    }
    public String getCorDasEscamas() {
        return corDasEscamas;
    }
    
}
