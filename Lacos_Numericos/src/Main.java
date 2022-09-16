public class Main {
    public static void main(String[] args) {

        int b = 0;
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                b = i * j;
                System.out.printf("%d x %d = %d%n",i , j, b);
            }
            System.out.println("");
        }


    }
}