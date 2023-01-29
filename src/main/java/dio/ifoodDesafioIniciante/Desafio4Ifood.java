package dio.ifoodDesafioIniciante;

import java.util.*;

public class Desafio4Ifood {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        String p1 = "";
        String p2 = "";

        int num = number.nextInt();

        if(num % 3 == 0){
            p1 = "Fizz";
            if(num % 5 == 0){
                p2 = "Buzz";
            }
        }

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

       if(p1 != "Fizz" && p2 != "Buzz"){
            System.out.println(num);
        }
        else{
            System.out.println(p1+p2);
        }

    }
}
