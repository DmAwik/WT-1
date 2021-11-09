package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter х:");
        double x = sc.nextDouble();
        System.out.print("Enter y:");
        double y = sc.nextDouble();
        double numerator = (1 + (Math.sin(x + y)) * (Math.sin(x + y)));
        double denominator = (2 + Math.abs(x - 2 * x / (1 + x * x * y * y)));
        System.out.print(numerator / denominator + x);
    }
}
