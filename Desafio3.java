import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro segmento: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo segmento: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro segmento: ");
        double lado3 = scanner.nextDouble();

        System.out.println(" ");

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Os segmentos PODEM formar um triângulo.");

            // Verifica o tipo de triângulo:
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O tipo do triângulo é EQUILÁTERO, pois todos os lados são iguais.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O tipo do triângulo é ISÓSCELES, pois dois lados são iguais.");
            } else {
                System.out.println("O tipo do triângulo é ESCALENO, pois todos os lados são diferentes.");
            }

        } else {
            System.out.println("Os segmentos NÃO podem formar um triângulo.");
        }

    }
}