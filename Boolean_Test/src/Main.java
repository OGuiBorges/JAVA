public class Main {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);
        String msg = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(msg);


    }

}