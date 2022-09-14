public class Main {
    public static void main(String[] args) {

        int [] numeros = {8, 12, 6, 22, 3};

        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
              if(numeros[i] > maior ) {
                maior = numeros[i];
            }
              if (numeros[i] < menor ) {
                menor = numeros[i];
            }
              media += numeros[i];

        }

        System.out.println("Maior número" + maior );
        System.out.println("Menor número" + menor );
        System.out.println("Média dos números" + media/ numeros.length);
    }
}