import java.util.Scanner;

public class Desafio10 {

    // Procedimento Fibonacci que recebe um número inteiro como parâmetro
    public static void Fibonacci(int n) {
        int termo1 = 1, termo2 = 1;

        // Caso n seja 1 ou 2, imprime os primeiros dois termos
        if (n >= 1) {
            System.out.print(termo1);
            if (n > 1) {
                System.out.print(" > " + termo2);
            }
        }

        // Gera os próximos termos da sequência de Fibonacci
        for (int i = 3; i <= n; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(" > " + proximoTermo);
            termo1 = termo2;
            termo2 = proximoTermo;
        }

        // Finaliza a sequência com a palavra "FIM"
        System.out.println(" > FIM");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de termos da sequência de Fibonacci
        System.out.print("Digite quantos termos da sequência de Fibonacci você deseja ver: ");
        int n = scanner.nextInt();

        // Chama o procedimento Fibonacci com o valor fornecido
        Fibonacci(n);
    }
}