import java.util.Random;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int numeroDeTentativas = 0;
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;

        while (numeroDeTentativas < 5) {
            System.out.println("digite um número de 1 a 100: ");
            numeroDigitado = Leitor.nextInt();
            numeroDeTentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("PARABÉNS! Você descobriu o número secreto! E usou " + numeroDeTentativas + " tentativas");
                break;
            }
            else if (numeroDigitado < numeroGerado) {
                System.out.println("o número secreto é maior!");
            }
            else {
                System.out.println("o número secreto é menor!");
            }
        }


        if (numeroDeTentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("você não conseguiu acertar o número em 5 tentativas :(, o número secreto era: " + numeroGerado);
        }

    }
}
