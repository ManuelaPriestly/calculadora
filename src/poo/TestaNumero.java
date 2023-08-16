package poo;

import java.util.Scanner;

public class TestaNumero {
    public static void main(St,m 
        String calculo = sc.next();
        int posicao = calculo.indexOf("+");
        if (posicao == -1) {
            posicao = calculo.indexOf("-");
        }
        if (posicao == -1) {
            posicao = calculo.indexOf("*");
        }
        if (posicao == -1) {
            posicao = calculo.indexOf("/");
        }

        int numero = Integer.parseInt(calculo.substring(0, posicao));
        int numeroDois = Integer.parseInt(calculo.substring(posicao + 1, calculo.length()));
        String operador = calculo.substring(posicao, posicao + 1);
        if (operador.equals("+"))
        {
            System.out.println(numero+numeroDois);
        
        }
        if (operador.equals("-")){
            System.out.println(numero-numeroDois);
        }
        if (operador.equals("*")){
            System.out.println(numero*numeroDois);
        }
        if (operador.equals("/") && numeroDois != 0) {
            System.out.println(numero/numeroDois);
        }
    
    

            }
}