import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada manual
        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarrosPorDia = scanner.nextInt();

        // Entrada manual
        System.out.print("Faz quantos anos que você fuma? ");
        int anosFumando = scanner.nextInt();

        // Calcula o total de cigarros fumados até hoje
        // Multiplica a quantidade de cigarros por dia pelos anos de fumo, convertendo anos em dias (anos * 365)
        int totalDeCigarros = cigarrosPorDia * anosFumando * 365;

        // Cada cigarro reduz 10 minutos de vida.
        // Multiplicamos o total de cigarros fumados por 10 para saber quantos minutos de vida foram perdidos
        int minutosPerdidos = totalDeCigarros * 10;

        // Agora, vamos converter minutos perdidos em dias:
        // Sabemos que 1 dia tem 1440 minutos (60 minutos * 24 horas)
        // Dividimos o total de minutos perdidos por 1440 para obter o total de dias perdidos
        int diasPerdidos = minutosPerdidos / (60 * 24);

        // Saída
        System.out.print("Você perdeu aproximadamente " + diasPerdidos + " dias de vida.");

    }
}
