import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da materiz: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        
        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0 ){
                    count++;
                }
            }
        }

         for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "  "); 
            }
            System.out.println();
        }

        List<Integer> diagonal = new ArrayList<>();
        int num;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    num = matriz[i][j];
                    diagonal.add(num);
                }
            }
        }

        System.out.println("Total de numeros negativos: " + count);
        System.out.print("Numeros na diagonal: ");
        for (Integer numero : diagonal) {
            System.out.print(numero);
        }
        sc.close();
    }
}
