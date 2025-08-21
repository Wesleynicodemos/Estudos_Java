public class ForEach {
    public static void main(String[] args) throws Exception {
        
        String[] names = new String[] {"Wesley", "Maria" , "João", "Maia"};
        int count = 1;

        for (String name : names) {
            System.out.println(count + ": " + name);
            count++;
        }

        System.out.println("-----------");
        
        int[] numbers = new int[] {123, 824, 0, 8 , 543, 100, 1};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
