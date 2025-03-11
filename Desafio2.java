import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro segmento: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo segmento: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro segmento: ");
        double lado3 = scanner.nextDouble();

        // Condições que todas sejam verdadeiras ao mesmo tempo
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Os segmentos podem formar um triângulo.");
        } else {
            System.out.println("Os segmentos não podem formar um triângulo.");
        }

    }
}