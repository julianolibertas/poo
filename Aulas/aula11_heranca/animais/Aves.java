package animais;

public class Aves extends Animais {
    private String especie;
    private String corDasPenas;

    public Aves(String nome, int idade, String especie, String corDasPenas ){
        super(nome, idade);
        this.especie = especie;
        this.corDasPenas = corDasPenas;
    }
    public void voar() {
        System.out.println("Está voando...");
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getCorDasPenas() {
        return corDasPenas;
    }
    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }
    

}
