public class OlaMundo {
    public static void main(String[] args) {
        // Verificamos se o usuário passou algum nome na "sacola" args
        if (args.length > 0) {
            System.out.println("Olá, " + args[0] + "!");
        } else {
            System.out.println("Olá, Visitante Anônimo!");
        }
    }
}