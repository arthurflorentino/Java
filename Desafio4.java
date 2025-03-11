import java.util.Scanner;
import java.util.Random;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();  // Para gerar a escolha aleatória do computador

        // Opções possíveis
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        // Exibe as opções para o jogador
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");
        System.out.print("Escolha uma opção: ");

        // Lê a escolha do jogador
        int escolhaJogador = scanner.nextInt();

        // Verifica se a escolha do jogador é válida
        if (escolhaJogador < 0 || escolhaJogador > 2) {
            System.out.println("Escolha inválida! Por favor, escolha um número de 0 até 2.");
        }

        // Escolha aleatória do computador
        int escolhaComputador = random.nextInt(3);

        // Exibe as escolhas
        System.out.println("Você escolheu: " + opcoes[escolhaJogador]);
        System.out.println("O computador escolheu: " + opcoes[escolhaComputador]);

        // Determina o vencedor
        if (escolhaJogador == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaJogador == 0 && escolhaComputador == 2) ||
                (escolhaJogador == 1 && escolhaComputador == 0) ||
                (escolhaJogador == 2 && escolhaComputador == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O computador venceu!");
        }

    }
}
