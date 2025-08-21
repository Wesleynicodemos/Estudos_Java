import java.util.Scanner;

public class ExercicioTres {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3, numero4, diferenca;

        System.out.println("Digite os numeros:");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();
        numero4 = sc.nextInt();

        diferenca = (numero1 * numero2) - (numero3 * numero4);

        System.out.println("A diferença é de " + diferenca);

        sc.close();
    }
}
