package array_for;

public class Array_For {

    public int[] numeros = {10,20,30,40};
    
    public Array_For(){
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma+=numeros[i];
        }
        System.out.println(soma);
    }
    public static void main(String[] args) {
        Array_For array = new Array_For();
    }
    
}
