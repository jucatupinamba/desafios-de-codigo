package thirdyDaysOfCode;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer num1 = 4;
        double num3 = 4.0d;
        String text = "HackerRank ";

        Integer num2 = scan.nextInt();
        double num4 = scan.nextDouble();
        String text2 = scan.nextLine();

        System.out.println(num1 + num2);
        System.out.println(num3 + num4);
        System.out.println(text + text2);
    }

}
