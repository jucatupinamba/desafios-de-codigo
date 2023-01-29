package dio.ifoodDesafioIntermediario;

import java.util.Scanner;

public class Desafio4 {
        public static void main(String args[]) {

            Scanner input = new Scanner(System.in);
            int i;
            int N = input.nextInt();
            int [] nums = new int[N];
            for (i = 0; i < N; i++)
            {
                nums[i] = input.nextInt();
            }
            //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares
            int j = 0;
            int [] sequence = new int [nums.length];

            for (i = 0; i < sequence.length; i++) {
                if(nums[i] % 2 == 0){

                }
            }
        }
    }

