package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter х:");
        double x = sc.nextDouble();
        System.out.print("Enter y:");
        double y = sc.nextDouble();
        if (x<=4 && x>=-4 && y>=-3 && y<=5 || x>=-6 && y<=0 && y>=-3 && x<=6)
            System.out.print("true");
        else
            System.out.print("false");
    }
}
