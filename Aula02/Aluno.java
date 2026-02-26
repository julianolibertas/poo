public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    // Método para calcular a média aritmética
    public void calcularMedia() {
        this.media = (nota1 + nota2) / 2;
    }

    // Método auxiliar para exibir os dados do aluno
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média Final: %.2f%n", media);
        System.out.println("---------------------------");
    }
}