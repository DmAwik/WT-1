package Task9;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Ball> balls;
    public double weight;
    public Basket(ArrayList<Ball> balls)
    {
        this.balls = new ArrayList<>();
        for (Ball ball: balls)
            add(ball);
    }
    public void add(Ball newBall)
    {
        this.balls.add(newBall);
        this.weight += newBall.weight;
    }
}
