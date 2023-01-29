package dio.ifoodDesafioIniciante;

import java.util.*;

public class Desafio5Ifood {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int numero = leitor.nextInt();
        boolean achei = false;
        int i;

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        for(i = 0; i < elementos.length; i++){
            if(numero == elementos[i]){
                achei = true;
                break;
            }
        }
        if(achei == true){
            System.out.printf("Achei %d na posição %d", numero, i);
        }
        else{
            System.out.printf("Numero %d não encontrado!", numero);
        }
    }
}
