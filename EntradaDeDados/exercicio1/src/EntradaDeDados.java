import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu nome: ");
        String nome;
        nome = sc.next();

        System.out.println("Seu nome é: " + nome);

        System.out.println("Digite um numero: ");
        int numero;
        numero = sc.nextInt();

        System.out.println("Você digitou: " + numero);

        System.out.println("Digite um numero de ponto flutuante: ");
        double pontoFlutuante;
        pontoFlutuante = sc.nextDouble();

        System.out.println("Você digitou: " + pontoFlutuante);

        // Lendo um char

        
        System.out.println("Digite uma letra: ");
        char letra;
        letra = sc.next().charAt(0);
        System.out.println("Você digitou a letra: " + letra);

        sc.close();
    }
}
