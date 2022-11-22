package dio.iniciante;


import java.util.Scanner;

public class Desafio2Ifood {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int soma = 0;

        for(int i = 1; i <= N; i++){
            if(i % A == 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}