package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will rented: ");
        int n = sc.nextInt();

        Aluno[] rooms = new Aluno[10];
        

        for (int i = 0; i < n; i++) {
            System.out.println("rent #" + (i+1) + ": " );
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            rooms[room] = new Aluno(name, email);;
            
        }

        System.out.println("Busy Rooms: ");

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println((i) + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
            }
        }

        
        sc.close();
    }

}
