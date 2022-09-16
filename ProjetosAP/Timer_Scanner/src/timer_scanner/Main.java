package timer_scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double tempoAntigo = System.currentTimeMillis();
       
       String s = scan.nextLine();
       
       if(Main.convertTime(System.currentTimeMillis() - tempoAntigo) >= 2)
       {
           if(s.length() >= 10) {
               System.out.println("Show! A mensagem é " + s);
           }else{
               System.out.println("Sua mensagem é muito curta!");
           }
       }else{
           System.out.println("Ops! Você precisa esperar pelo menos 2 segundos..");
           System.out.println("Vamos tentar de novo?");
           tempoAntigo = System.currentTimeMillis();
           s = scan.nextLine();
           if(Main.convertTime(System.currentTimeMillis() - tempoAntigo) >= 2){
               System.out.println("Agora sim!" + s);
               
           }else{
               System.out.println("VocÊ falhou 2x! Ja era");
           }
           
           
           
           
       }
       }

    private static double convertTime(double tempo) {
        return tempo/1000;
    }

          
    }
    

