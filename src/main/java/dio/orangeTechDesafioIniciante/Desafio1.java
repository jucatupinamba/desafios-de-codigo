package dio.orangeTechDesafioIniciante;

/*
    Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês,
    ele quer saber quanto terá se juntar todo o dinheiro, sem gastar nada, durante alguns meses.
    E você, como um bom tio com habilidades de programação, vai criar um programa que com as entradas
    do seu sobrinho vai calcular automaticamente a quantidade de dinheiro que ele terá em X meses.
 */

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;

        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada

        int resultado = entrada * mesada;

        System.out.println(resultado);
    }
}
