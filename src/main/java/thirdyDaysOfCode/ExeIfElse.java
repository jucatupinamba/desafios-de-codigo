package thirdyDaysOfCode;

import java.util.Scanner;

public class ExeIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N >= 2 && N <= 5){
            if(N % 2 == 0){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }
        }
        else if(N >= 6 && N < 20 || N == 1){
            if(N % 2 == 0){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
        else if(N % 2 == 0){
            System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Weird");
        }

        scanner.close();
    }
}



