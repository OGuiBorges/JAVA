import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        saudacao(scan.nextLine());
        System.out.println("Digite dois numeros para somar: ");
        int r = soma(scan.nextInt(), scan.nextInt());
        System.out.println(r);

    }

    public static int soma(int n1, int n2){
        return n1 + n2;
    }
    public static void saudacao(String nomeParametro){
        System.out.printf("Hello, %s%n", nomeParametro);
    }


}