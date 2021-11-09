package Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int j = 0; j < array.length; j++) {
            System.out.format("Array[%d] = ", j);
            array[j] = sc.nextInt();
        }

        shellSort(array);
    }

    private static void shellSort(int[] array){
        int i = 0;
        while(i < array.length - 1){
            if(array[i] <= array[i + 1])
                i++;
            else{
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if(i != 0)
                    i--;
            }
        }
        outputArray(array);
    }

    private static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
