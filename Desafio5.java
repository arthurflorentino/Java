import java.util.Scanner;
import java.util.Random;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Para ler a entrada do jogador
        Random random = new Random();  // Para gerar o número aleatório

        // O computador sorteia um número entre 1 e 5
        int numeroSorteado = random.nextInt(5) + 1;

        // Instrução para o jogador
        System.out.println("Tente adivinhar o número sorteado entre 1 e 5!");
        System.out.print("Faça sua escolha: ");

        // Leitura da tentativa do jogador
        int tentativa = scanner.nextInt();

        // Verifica se a tentativa está dentro do intervalo válido
        if (tentativa < 1 || tentativa > 5) {
            System.out.println("Escolha um número entre 1 e 5!");
        } else {
            // Verifica se o jogador acertou o número
            if (tentativa == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número sorteado!");
            } else {
                System.out.println("Ops! O número sorteado foi " + numeroSorteado + ". Tente novamente!");
            }
        }
    }
}