public class MainAluno {
    public static void main(String[] args) {
        // --- Instanciando o Aluno 1 ---
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana Silva";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 9.0;
        aluno1.calcularMedia();

        // --- Instanciando o Aluno 2 ---
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bruno Costa";
        aluno2.nota1 = 7.0;
        aluno2.nota2 = 5.5;
        aluno2.calcularMedia();

        // --- Instanciando o Aluno 3 ---
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Carla Souza";
        aluno3.nota1 = 10.0;
        aluno3.nota2 = 9.5;
        aluno3.calcularMedia();

        // Exibindo os resultados
        System.out.println("=== RELATÓRIO DE NOTAS ===\n");
        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();
    }
}
