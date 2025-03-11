import java.util.Random;
import java.util.Arrays;

public class Desafio9 {
    public static void main(String[] args) {
        // Criando um vetor de 20 posições
        int[] vetor = new int[20];

        Random random = new Random();  // Instancia o objeto para gerar números aleatórios

        // Preenchendo o vetor com números aleatórios entre 0 e 99
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);  // Gera números entre 0 e 99
        }

        // Mostrando os números gerados
        System.out.println("Números gerados aleatoriamente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Ordenando o vetor em ordem crescente
        Arrays.sort(vetor);

        // Mostrando os números ordenados
        System.out.println("\n\nNúmeros ordenados em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}