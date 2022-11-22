package thirdyDaysOfCode;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {
    double meal_cost;
    int tip_percent;
    int tax_percent;

        public Result(){}
        public static void solve(double meal_cost, int tip_percent, int tax_percent) {
            meal_cost = meal_cost;
            tip_percent = tip_percent;
            tax_percent = tax_percent;

        }

        public int calculo(double meal_cost, int tip_percent, int tax_percent){
            int result = (int) ((meal_cost * tip_percent / 100) + (meal_cost * tax_percent / 100) + meal_cost);
            return result;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

            int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

            int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

            Result.solve(meal_cost, tip_percent, tax_percent);

            Result result = new Result();

            System.out.println(result.calculo(meal_cost, tip_percent, tax_percent));

            bufferedReader.close();


        }
    }


