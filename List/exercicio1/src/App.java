import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> names = new ArrayList<>();

        //Adding elements to the list.
        names.add("Wesley");
        names.add("Maria");
        names.add("Maia");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--------------");

        //Inserting elements in the middle of the list.
        names.add(2,"João");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--------------");
        
        //Removing elements from the list.
        names.remove("Wesley");

        for (String name : names) {
            System.out.println(name);
        }

    }
}
