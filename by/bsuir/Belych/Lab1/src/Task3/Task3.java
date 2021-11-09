package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = sc.nextDouble();
        System.out.print("Enter b:");
        double b = sc.nextDouble();
        System.out.print("Enter h:");
        double h = sc.nextDouble();

        if (a >= b){
            throw new IllegalArgumentException("Left border must be grater than right one");
        }

        int tableSize = (int)((b - a)/h+1);
        double[][] resultTable = new double[tableSize][2];
        int i = 0;
        //System.out.println(tableSize);
        while (i < tableSize){
            resultTable[i][0] = a;
            resultTable[i++][1] = Math.tan(a);
            a += h;
        }
        for (i = 0; i < resultTable.length; i++) {
            for (int j = 0; j < resultTable[i].length; j++) {
                System.out.print(resultTable[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
