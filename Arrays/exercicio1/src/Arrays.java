import java.util.Locale;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] array = new double[n];
        double total = 0;
        double media;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            array[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            total += array[i];
        }

        media = total / n;

        System.out.println(media);

        


    }
}
