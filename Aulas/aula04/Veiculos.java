package aula04;

import java.time.LocalDate;

public class Veiculos {
  String placa;
  String modelo;
  String marca;
  int anoFabricacao;
  double valor;

  // Retorna quantos anos tem o carro
  public int  calculaIdade(){
    int idade = LocalDate.now().getYear()-anoFabricacao;
    return idade;
  }

  // Calcula 4% do valor. Isento se o ano for maior 20 anos
  public double valorIPVA() {
    if (this.calculaIdade() >= 20) {
      return 0.0;
    }
    return this.valor*0.04;
  }

  public double valorSeguro() {
      return this.valor*0.06;
  }
}


  

