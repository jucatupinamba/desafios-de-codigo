package dio.bancoPanJavaDeveloper.basico;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2NumerosPositivos  {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        String x = "";
        double somaMedia = 0;
        double valor;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for(int i  = 0; i < 6; i++){
            x = leitor.next();
            valor = Double.parseDouble(x.replace(',', '.'));
            if(valor > 0){
                cont++;
                somaMedia += valor;
            }
        }
            media = somaMedia / cont;
                    System.out.println(cont + " valores positivos");
                    System.out.println(String.format("%.1f", media));
                    }
}

