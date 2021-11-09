package Task5;

import java.util.Scanner;

public class Task5 {
    public static int size;

    public static void main(String[] args) {
        int[] array;
        Scanner in = new Scanner(System.in);

            System.out.println("Enter count of array: ");
        size = in.nextInt();
            array = new int[size];

            for (int j = 0; j < size; j++) {
                System.out.format("Array[%d] = ", j);
                array[j] = in.nextInt();
            }

            task5(array);

    }
    public static void task5(int[] array){
        int countOfRemoveEl,i;
        int firstElement = array[0];
        for ( i = 1, countOfRemoveEl = 0; i < size; i++){
            if (firstElement >= array[i]){
                countOfRemoveEl = countOfRemoveEl + 1;
                System.out.println("Remove:");
                System.out.format("Array[%d] = %d\n", i, array[i]);
            }
            if (firstElement < array[i]){
                firstElement = array[i];
            }
        }
        System.out.println("number of removable elements = "+countOfRemoveEl);
    }
}
