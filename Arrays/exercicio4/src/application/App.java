package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many people will you type?");
        int quantity = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[quantity];
        
        int person = 1;
        

        for (int i = 0; i < pessoas.length; i++) {

            System.out.print( i+1 + "ª person:");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            pessoas[i] = new Pessoa(name, age, height);

            if (pessoas[i].getAge() < 16 ) {
                
                person++;
                System.out.println(person);

            }

        }

        String[] nomes = new String[person];

        for (int i = 0; i <pessoas.length; i++) {
            if (pessoas[i].getAge() < 16 ) {
                nomes[i] = pessoas[i].getName();
            }
        }

        double sum = 0.0;

        for (int i = 0; i < pessoas.length; i++) {
            sum += pessoas[i].getHeight();
        }

        double avg = sum / pessoas.length; 

        System.out.println("Altura media: " + avg);

        double percentage = (person - 1) * 100.0 / pessoas.length;

        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + percentage + "%");

        

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == null) {
                continue;
            }
            System.out.printf("%s%n",nomes[i]);
        }

        sc.close();
    }
}
