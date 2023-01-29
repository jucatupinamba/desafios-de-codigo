package dio.ifoodDesafioIntermediario;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n + 1];

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
        for (int i = 0; i < (n + 1); i++) {
            d[i] = i * i;
        }


        int sqrt = (int) Math.sqrt(n);


        if (sqrt * sqrt == n) {
            System.out.println("1");
        } else {


            search:
            for (int i = 1; i < (n + 1); i++) {
                for (int j = 1; j < (n + 1); j++) {
                    if (d[0] == 0) {
                        for (int k = 1; k < (n + 1); k++) {
                            if (d[i] + d[j] + d[k] == n) {
                                d[0] = 3;
                                break;
                            }
                        }
                    }
                    if (d[0] == 0 || d[0] == 3) {
                        if (d[i] + d[j] == n) {
                            d[0] = 2;
                            break search;
                        }
                    }
                }
            }




            if (d[0] != 0) {
                System.out.println(d[0]);
                d[0] = 0;
            } else {
                System.out.println("4");
            }


        }
    }
}