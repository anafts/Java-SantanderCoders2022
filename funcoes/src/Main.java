public class Main {
    public static void main(String[] args) {
        // Ponto de partida: método main

        String nomeOriginal = "Ana";
        saudacao(nomeOriginal);
    }

    // nomes de variáveis iguais apenas no mesmo escopo { }
    public static void saudacao(String nomeParametro) {
        System.out.println("Hello," + nomeParametro + "!");
    }
}