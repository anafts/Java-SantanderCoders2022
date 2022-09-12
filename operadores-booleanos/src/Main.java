public class Main {
    public static void main(String[] args) {

        // operador and -> &&
        boolean fimDeSemana = true;
        boolean tempoDeSol = true;
        boolean vamosAPraia = fimDeSemana && tempoDeSol;


        // operador or -> ||
        boolean nublado = true;
        boolean chovendo = false;
        boolean levarGuardaChuva =  nublado || chovendo;


        // operador ternário -> ? :
        boolean segunda = true;
        String mensagem = segunda ? "É segunda-feira" : "Não é segunda-feira";

        // console
        System.out.println(vamosAPraia);
        System.out.println(levarGuardaChuva);
        System.out.println(mensagem);
    }
}