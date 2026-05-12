package exercicio03;

public class Professor {
  private String nome;
  private Curso cursoAtribuido;

  public Professor(String nome, Curso curso){
    this.nome = nome;
    this.cursoAtribuido = curso;
  }
  public void gerarRelatorioNotas(){
    System.out.println("Professor: " + this.nome);
    System.out.println("Curso: " + cursoAtribuido.getNomeCurso());
    System.out.println("---------------------------------");

    for (Aluno a: cursoAtribuido.getAlunos()){
      String status = a.estaAprovado()?"Aprovado":"Reprovado";
      System.out.println("Aluno: " +a.getNome()+
                        " | Média: " + a.calcularMedia()+
                        " | Faltas: " + a.getFaltas()+
                        " | Status: "+ status );
    }
  }


}
