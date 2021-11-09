package Task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        double[][] matrix;
        double[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of array: ");
        int size = sc.nextInt();
        array = new double[size];
        matrix = new double[size][size];

        for (int j = 0; j < size; j++) {
            System.out.format("Array[%d] = ", j);
            array[j] = sc.nextDouble();
        }
        task6(array, matrix);
    }
    public static void task6(double[] array, double[][] matrix){
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                matrix[i][j] = array[(j + i) % array.length];
            }
        }
        System.out.println("Array: ");
        outputArray(array);
        System.out.println();
        System.out.println("Matrix: ");
        outputMatrix(matrix);
    }

    public static void outputMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.format("%.2f  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void outputArray(double[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.format("%.2f  ", array[j]);
        }
    }

}
