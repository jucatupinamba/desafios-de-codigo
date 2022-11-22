package thirdyDaysOfCode;


import java.io.IOException;
import java.util.Scanner;

public class QuebecDIO {

    public static void main(String[] args) {
        int numero = new Scanner(System.in).nextInt();
        var count = 0;
        int num = numero;


        for (var i = 1; i <= numero; i++) {
            var strNum = String.valueOf(num);
            char[] vs = strNum.toCharArray();
            var sum = 0;
            for (var j = 0; j < strNum.toCharArray().length; j++) {
                sum += (int) Character.getNumericValue(vs[j]);
            }
            if (sum % 2 == 0) {
                count++;
            }
            num -= 1;
        }
        System.out.println(count);
    }
}