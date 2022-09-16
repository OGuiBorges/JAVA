public class Main {
    public static void main(String[] args) {
        int nota = 100;
        String graduacao = "";
        
        if (nota >= 80){
            graduacao = "A";
        } else if (nota >= 70) {
            graduacao = "B";
        } else if (nota >= 60) {
            graduacao = "C";
        } else if (nota >= 0) {
            graduacao = "D";
        } else{
            graduacao = "";
        }

        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Aluno Reprovado!");
                break;
            default:
                System.out.println("Nota Invalida!");
        }
    }
}