package Task9;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        double totalWeight=0;
        int countOfBlueBalls=0;
        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
                new Ball(Color.GREEN, 1.0),
                new Ball(Color.BLACK, 0.9),
                new Ball(Color.RED, 0.54),
                new Ball(Color.BLUE, 0.14),
                new Ball(Color.YELLOW, 0.453),
                new Ball(Color.BLUE, 0.856)
        ));

        Basket basket = new Basket(balls);
        System.out.println("Balls inside the basket: ");
        for (Ball ball: basket.balls) {
            totalWeight +=ball.weight;
            if (ball.color ==Color.BLUE)
                countOfBlueBalls++;
            System.out.println("Color: " + ball.color  + " weight: " + ball.weight);

        }
        System.out.println("countOfBlueBalls:"+countOfBlueBalls);
        System.out.println("Totalweight:"+totalWeight);
    }

}
