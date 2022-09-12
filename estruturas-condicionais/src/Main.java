public class Main {
    public static void main(String[] args) {

        String aluno = "Luna";
        int notaPrimeiraUnidade = 7;
        int notaSegundaUnidade = 9;
        int notaFinal = (7 + 9) / 2;

        System.out.println(aluno);

        if (notaFinal >= 6){
            System.out.println("Aprovado(a)!");
        } else {
            System.out.println("Reprovado(a)!");
        }

        System.out.println("Média Final:" + notaFinal);
    }
}