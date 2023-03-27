package dio.bancoPanJavaDeveloper.basico;

/*
Neste desafio, faça um programa que calcule o valor de H com N termos.

Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
 */

import java.util.Scanner;

public class Desafio3SomaH {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();


        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += (double)1/i;
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        int numfinal = (int)Math.round(h);
        System.out.println(numfinal);
    }
}