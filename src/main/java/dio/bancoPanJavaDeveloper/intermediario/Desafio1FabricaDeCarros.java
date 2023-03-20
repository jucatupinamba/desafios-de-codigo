package dio.bancoPanJavaDeveloper.intermediario;

import java.util.Scanner;

public class Desafio1FabricaDeCarros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;

        int Distribuidor;
        int ValorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;


        System.out.println();
    }
}