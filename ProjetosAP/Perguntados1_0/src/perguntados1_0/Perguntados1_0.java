package perguntados1_0;

import java.util.Scanner;

public class Perguntados1_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;
        System.out.println("Bem vindo ao Perguntados 1.0!");
        System.out.println("Deseja jogar? Pressione (s) para continuar");
        String resp = scanner.nextLine();
        if(resp.equals("s")){
            System.out.println("Muito bem, primeira pergunta!");
            System.out.println("Qual primeira letra do alfabeto em minusculo? ");
            resp = scanner.nextLine();
            if(resp.equals("a")){
                pontuacao++;
                System.out.println("Parabens, você acertou!");
                System.out.println("Deseja continuar? Sim(s) Não(qualquer outra tecla)");
                resp = scanner.nextLine();
                if(resp.equals("s")){
                    System.out.println("Muito bem, primeira pergunta!");
                    System.out.println("Qual letra (em minusculo) representa os numeros naturais? ");
                    resp = scanner.nextLine();
                    if(resp.equals("n")){
                        pontuacao++;
                        System.out.println("Parabens, você acertou!");
                        System.out.println("Deseja continuar? Sim(s) Não(qualquer outra tecla)");
                        resp = scanner.nextLine();
                        if(resp.equals("s")){
                            System.out.println("Muito bem, primeira pergunta!");
                            System.out.println("Qual letra (em minusculo) representa os numeros reais? ");
                            resp = scanner.nextLine();
                                if(resp.equals("r")){
                                pontuacao++;
                                System.out.println("Parabens, você acertou!");
                                System.out.println("Sua pontuação foi " + pontuacao);
                }else{
                                    System.out.println("Puxa o Jogo acabou. Sua pontuação foi " + pontuacao);
                                }}else{
                            System.out.println("Puxa o Jogo acabou. Sua pontuação foi " + pontuacao);
                        }}else{
                        System.out.println("Puxa o Jogo acabou. Sua pontuação foi " + pontuacao);                        
                    }}else{
                System.out.println("Puxa o Jogo acabou. Sua pontuação foi " + pontuacao);
                }
            }else{
            System.out.println("Puxa o Jogo acabou. Sua pontuação foi " + pontuacao);
            }
        }else{
        System.out.println("Puxa o Jogo acabou. Sua pontuação foi " + pontuacao);
        }
                
    }
    
}
