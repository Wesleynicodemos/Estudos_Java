public class App {
    public static void main(String[] args) throws Exception {

        String textoInicial = "Sou um texto normal.";

        System.out.println("Sou o texto inicial: " + textoInicial);

        StringBuilder novoTexto = new StringBuilder(textoInicial);

        novoTexto.reverse();

        System.out.println("Sou o novo texto: " + novoTexto);

    }
}
