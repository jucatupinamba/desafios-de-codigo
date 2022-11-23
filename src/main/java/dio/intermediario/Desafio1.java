package dio.intermediario;
/*
    Desafios realizados no bootcamp. Enunciado no final do código.
    Juarez Martins - 943617199
 */

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String resposta = "FALSE";

        StringBuilder input = new StringBuilder();
        input.append(palavra);
        input.reverse();
        String resultado = input.toString();

        if(palavra.equals(resultado)){
            resposta = "TRUE";
        }
        
        System.out.println(resposta);

    }
}
/*
Desafio

Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida. 

Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes. 

Logo, NÃO é um Palíndromo. 

Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.
Entrada

A entrada consiste em um palavra.
Saída

Para cada String informada, terá uma saída de valor Booleano: TRUE, caso a palavra seja um palíndromo, ou FALSE caso a palavra NÃO seja um palíndromo.
 */
