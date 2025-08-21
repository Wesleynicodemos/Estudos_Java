import java.util.Scanner;

public class Exercicio {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, soma;

        System.out.println("Vamos Somar!");
        System.out.println("Digite o primeiro Numero:");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo Numero:");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 +" e " + numero2 + " é igual a " + soma);
        
    }
}
