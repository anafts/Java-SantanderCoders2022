import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numeros = new int [5]; // declaração do tamanho do array
        numeros[0] = 3;
        numeros[1] = 6;
        numeros[2] = 9;
        numeros[3] = 12;
        numeros[4] = 15;

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String [] letras = {"A" , "B" , "C" , "D"};

            System.out.println(Arrays.toString(letras));


    }
}