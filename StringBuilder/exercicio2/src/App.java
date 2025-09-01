public class App {
    public static void main(String[] args) throws Exception {
        
    String[] frutas = new String[] {"manga", "uva", "melão"};

    StringBuilder listaFrutas = new StringBuilder();

        for(int i = 0; i < frutas.length; i++) {
            listaFrutas.append(i+1).append(".").append(frutas[i] + "\n");
        }
        listaFrutas.toString();

        System.out.print(listaFrutas);
    }

    
}
