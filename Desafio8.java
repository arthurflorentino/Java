public class Desafio8 {
    public static void main(String[] args) {
        // Inicializa os dois primeiros elementos da sequência de Fibonacci
        int termo1 = 1, termo2 = 1;

        System.out.println("Os 10 primeiros termos da sequência de Fibonacci são:");

        // Exibe os primeiros dois termos da sequência
        System.out.print(termo1 + " " + termo2 + " ");

        // Calcula e exibe os próximos 8 termos
        for (int i = 3; i <= 10; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");

            // Atualiza os termos para o próximo cálculo
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}