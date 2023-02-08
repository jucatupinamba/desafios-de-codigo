package dio.orangeTechDesafioIntermediario;

/*
Você levou sua namorada na incrível rede de lanchonetes Dc Monalds e ficou
maravilhado como aquele lanche era gostoso. Porém, ficou horrorizado como
algumas coisas no aplicativo do cardápio estavam erradas. Então, você se ofereceu
para ajudá-los com seus conhecimentos de programação. Ao conversar com o gerente,
ele te explicou que a vontade da lanchonete era criar um menu com os nomes dos
ingredientes formando o lanche.

Exemplo de entrada:    Pao;Presunto;Carne;Pao
 */

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída

        String novaLista = ingredientes.replaceAll(";", "\n");

        System.out.println(novaLista);
    }
}