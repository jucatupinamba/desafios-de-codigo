package dio.intermediario;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {

        if(s.equals("()") || s.equals("[]")){
            return true;
        }
        else{
            return false;
        }
    }
}
/*
Desafio

Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida. 
Entrada

Uma string é considerada válida se:

Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida. 

 */

