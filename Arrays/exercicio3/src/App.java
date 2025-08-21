import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type: ");
        int quantity = sc.nextInt();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();

        }
        System.out.println("Negative Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers[i] > 0) {
                continue;
            } else {
                System.out.println(numbers[i]);
            }

        }
    }
}
