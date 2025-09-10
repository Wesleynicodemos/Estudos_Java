package application;

import java.util.Scanner;

import entities.Cachorro;
import entities.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do cachorro: ");
        String nome = sc.nextLine();
        System.out.print("Raça do cachorro: ");
        String raça = sc.nextLine();

        Cachorro cachorro = new Cachorro(nome, raça);
        
        cachorro.infoAnimal();
        System.out.println();
        cachorro.somAnimal();

        System.out.print("Nome do gato: ");
        nome = sc.nextLine();
        System.out.print("Raça do gato: ");
        raça = sc.nextLine();

        Gato gato = new Gato(nome, raça);

        gato.infoAnimal();
        System.out.println();
        gato.somAnimal();

        sc.close();
    }
}
