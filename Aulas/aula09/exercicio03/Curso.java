package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  private String nomeCurso;
  private List<Aluno> alunos;

  public Curso(String nomeCurso) {
    this.nomeCurso = nomeCurso;
    this.alunos = new ArrayList<>();
  }
  public void matricularAluno(Aluno a){
    this.alunos.add(a);
  }
  public String getNomeCurso() {
    return nomeCurso;
  }
  public List<Aluno> getAlunos() {
    return alunos;
  }
  

  
}
