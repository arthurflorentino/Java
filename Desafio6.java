import java.util.Scanner;
import java.util.Random;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Para ler a entrada do jogador
        Random random = new Random();  // Para gerar o número aleatório

        // O computador sorteia um número entre 1 e 10
        int numeroSorteado = random.nextInt(10) + 1;

        // Informações para o jogador
        System.out.println("Bem-vindo ao jogo de adivinhar o número!");
        System.out.println("O computador sorteou um número entre 1 e 10.");
        System.out.println("Você tem 4 tentativas para adivinhar o número.");

        // Variável que controla o número de tentativas
        int tentativas = 4;

        // Loop que permite ao jogador fazer 4 tentativas
        while (tentativas > 0) {
            System.out.println("\nTentativa " + (5 - tentativas) + " de 4.");
            System.out.print("Digite o seu palpite: ");
            int tentativa = scanner.nextInt();

            // Verifica se a tentativa está dentro do intervalo válido
            if (tentativa < 1 || tentativa > 10) {
                System.out.println("Escolha um número entre 1 e 10!");
                continue; // Pula para a próxima iteração sem diminuir as tentativas
            }

            // Verifica se o jogador acertou o número
            if (tentativa == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número sorteado!");
                break; // Sai do loop porque o jogador acertou
            } else {
                tentativas--; // Diminui o número de tentativas restantes
                if (tentativas > 0) {
                    System.out.println("Ops! Você errou. Tente novamente.");
                    if (tentativa < numeroSorteado) {
                        System.out.println("Dica: O número sorteado é maior.");
                    } else {
                        System.out.println("Dica: O número sorteado é menor.");
                    }
                } else {
                    System.out.println("Você perdeu! O número sorteado era " + numeroSorteado + ".");
                }
            }
        }
    }
}