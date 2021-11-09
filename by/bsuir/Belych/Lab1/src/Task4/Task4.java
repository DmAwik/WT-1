package Task4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        boolean isPrime=false;

        for (int i = 0; i < size; i++) {
            System.out.format("Array[%d] = ", i);
            intArray[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int temp = 0;

            for (int j = 2; j <= Math.sqrt(intArray[i]); j++) {
                if (intArray[i] % j == 0) {
                    temp = 1;
                }
            }
            if (temp == 0) {
                isPrime = true;
                System.out.print(intArray[i] + " ");
            }
        }
        if (!isPrime) System.out.println("No prime numbers");
    }
}
