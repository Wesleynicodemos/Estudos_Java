import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int numberL = sc.nextInt();
        int numberC = sc.nextInt();

        int[][] mat = new int[numberL][numberC];

        for (int i = 0; i < numberL; i++){
            for (int j = 0; j< numberC; j++){
                System.out.print("Enter a number: ");
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numberL; i++){
            for (int j = 0; j < numberC; j++){
                System.out.print(mat[i][j] + "  ");   
            }
            System.out.println();
        }

        System.out.println("Choose a number: ");
        int num = sc.nextInt();

        for (int i = 0; i < numberL; i++){
            for (int j = 0; j < numberC; j++){
                    if ( num == mat[i][j] ){
                        System.out.println("position: " + i + ", " + j);
                        if ( j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                        }
                        if (i > 0) {
                            System.out.println("Up: " + mat[i-1][j]);
                        }
                        if (j < mat[i].length) {
                            System.out.println("Right: " + mat[i][j+1]);
                        }
                        if (i < mat[i].length) {
                            System.out.println("Down: " + mat[i+1][j]);
                        }
                    }
            }
        }

        sc.close();
    }
}
