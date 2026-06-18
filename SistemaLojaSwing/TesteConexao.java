package view;

import java.sql.Connection;

import dao.ConnectionFactory;

public class TesteConexao {
    public static void main(String[] args) {
        System.out.println("Iniciando o teste de conexão com o banco de dados...\n");

        try {
            // Tenta obter a conexão chamando a nossa fábrica
            Connection conexao = ConnectionFactory.getConnection();

            // Se o Java chegou até esta linha sem pular para o 'catch', deu certo!
            if (conexao != null) {
                System.out.println("✅ SUCESSO ABSOLUTO!");
                System.out.println("O Java e o MySQL estão conectados e conversando perfeitamente.");
                System.out.println("Banco de dados acessado: loja_exemplo");
                
                // É uma boa prática fechar a conexão quando não for mais usá-la
                conexao.close();
            }

        } catch (Exception e) {
            // Se algo der errado (senha inválida, banco não existe, MySQL desligado), cai aqui
            System.out.println("❌ ERRO AO CONECTAR!");
            System.out.println("O Java não conseguiu entrar no banco de dados.");
            System.out.println("Motivo técnico: " + e.getMessage());
            
            System.out.println("\n--- CHECKLIST DE SOLUÇÃO ---");
            System.out.println("1. O servidor MySQL (ex: XAMPP) está 'Startado' e rodando?");
            System.out.println("2. Você executou o script SQL para criar o banco 'loja_exemplo'?");
            System.out.println("3. O usuário ('root') e a senha na classe ConnectionFactory estão corretos?");
        }
    }
}
