import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 15, 1, 26, 2};
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Position: [%d]%n", i);
            System.out.printf("Valor: %d%n",numeros[i]);
        }
        System.out.println(Arrays.toString(numeros));

        int maior = numeros[0], menor = numeros[0];
        float media = 0;
        for (int j = 0; j < numeros.length; j++){
            if (numeros[j] > maior){
                maior = numeros[j];
            }
            if (numeros[j] < menor){
                menor = numeros[j];
            }
            media += numeros[j];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        media = media / (float) numeros.length;
        System.out.println("Média: " + media);


    }
}