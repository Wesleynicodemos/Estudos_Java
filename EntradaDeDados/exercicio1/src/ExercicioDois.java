import java.util.Locale;
import java.util.Scanner;


public class ExercicioDois {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;

        System.out.println("Digite o raio do circulo:");
        raio = sc.nextDouble();
        
        area = pi * (raio * raio);

        System.out.printf("A area do seu circulo é de %.4f " ,area);


        sc.close();
    }
}
