package exercicio03;

public class Main {
  public static void main(String[] args) {
    // instaciar o curso
    Curso filosofia = new Curso("Filosofia");
    // criar os alunos com suas notas e faltas
    Aluno a1 = new Aluno("José", 80.0, 75.0, 5);  // aprovado
    Aluno a2 = new Aluno("Maria", 90.0, 95.0, 2);  // aprovado
    Aluno a3 = new Aluno("João", 60.0, 50.0, 10);  // reprovado(média)
    Aluno a4 = new Aluno("Pedro", 100.0, 100.0, 25);  // reprovado(faltas)

    // Matricular Alunos no curso
    filosofia.matricularAluno(a1);
    filosofia.matricularAluno(a2);
    filosofia.matricularAluno(a3);
    filosofia.matricularAluno(a4);

    //criar o professor e associá-lo ao curso.
    Professor pitolomeu = new Professor("Pitolomeu", filosofia);

    // exibir o resultado
    pitolomeu.gerarRelatorioNotas();

    

  }
}
