package exercicio01;

public class Motorista extends Pessoa {
  private String tipoCnh;
  private Veiculo veiculo;

  public Motorista(String nome, int idade, String tipoCnh) {
    super(nome, idade);
    setTipoCnh(tipoCnh);
  }

  public String getTipoCnh() {
    return tipoCnh;
  }

  public void setTipoCnh(String tipoCnh) {
    String t = tipoCnh.toUpperCase();
    if (t == "A" || t == "B" || t == "C" || t == "D" ){
      this.tipoCnh = t;
    } else {
      System.out.println("Erro: Tipo de carteira inválido!");
      this.tipoCnh = "Indeterminada";
    };
  }

  @Override
  public String toString(){
    return super.toString() + ", Carteira: " + tipoCnh + "\nVeículo associado -> " + (veiculo != null? veiculo : "Nenhum");
  }

  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }
  
  
}
