import java.util.Scanner;

public class Desafio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o primeiro termo da PA e a razão
        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();

        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        // Variáveis para calcular a soma e exibir os termos
        int soma = 0;
        int termoAtual = primeiroTermo;

        System.out.println("\nOs 10 primeiros termos da PA são:");

        // Exibe os 10 primeiros termos da PA
        for (int i = 1; i <= 10; i++) {
            System.out.print(termoAtual + " ");
            soma += termoAtual;  // Soma os termos
            termoAtual += razao;  // Calcula o próximo termo
        }

        // Exibe a soma de todos os 10 termos
        System.out.println("\n\nA soma de todos os termos é: " + soma);
    }
}
