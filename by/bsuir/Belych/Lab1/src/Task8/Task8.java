package Task8;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        double[] arr1, arr2;
        int sizeFirstArr, sizeSecArr;
        Scanner in = new Scanner(System.in);
        System.out.println("Entry count of firstArray: ");
        sizeFirstArr = in.nextInt();
        arr1 = new double[sizeFirstArr];

        for (int j = 0; j < sizeFirstArr; j++) {
            System.out.format("arr1[%d] = ", j);
            arr1[j] = in.nextDouble();
        }

        System.out.println("Entry count of secondArray: ");
        sizeSecArr = in.nextInt();
        arr2 = new double[sizeSecArr];

        for (int j = 0; j < sizeSecArr; j++) {
            System.out.format("arr2[%d] = ", j);
            arr2[j] = in.nextDouble();
        }

        if ((arrayСheck(arr1) == true) && (arrayСheck(arr2) == true)){
            task8(arr1, arr2);
        }

    }
    public static boolean arrayСheck(double[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]){
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void task8(double[] arr1, double[] arr2)
    {
        int indexInArr1 = 0, indexInArr2 = 0, index = 0;

        while (indexInArr1 < arr1.length) {
            if (arr2[indexInArr2] < arr1[indexInArr1]) {
                System.out.print(index);
                System.out.print(" ");
                indexInArr2++;
            }
            else {
                indexInArr1++;
                index++;
            }

        }
        while (indexInArr2 != arr2.length) {
            System.out.print(index);
            System.out.print(" ");
            indexInArr2++;
        }
    }

}
