public class Main {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Fulano", 25,  "id0001");
    System.out.println("Aluno: " + aluno1.getNome() + ", idade: " + aluno1.getIdade() + ", matrícula: " + aluno1.getMatricula());
    aluno1.falar();
    aluno1.matricular();
  }
}
