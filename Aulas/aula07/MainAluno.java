public class MainAluno {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("João Silva","(35)9 9953-3829");
    aluno1.lancarNota(7, 8);
    aluno1.calculaMedia();
    aluno1.exibirAluno();

    //cenario2
    Aluno aluno2 = new Aluno("Maria Souza", "35999090909");
    aluno2.lancarNota(3, 6);
    aluno2.adicionaFalta();
    aluno2.adicionaFalta();
    aluno2.adicionaFalta();
    aluno2.calculaMedia();
    aluno2.exibirAluno();

    //cenario3
    Aluno aluno3 = new Aluno("Pedro Rocha", "51999998888");
    aluno3.lancarNota(7, 6);
    //adicionar 6 faltas
    for(int i=0;i<6;i++){
      aluno3.adicionaFalta();
    }
    aluno3.calculaMedia();
    aluno3.exibirAluno();




  
    

  }
}
