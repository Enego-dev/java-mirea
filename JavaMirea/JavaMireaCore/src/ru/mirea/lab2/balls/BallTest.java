package ru.mirea.lab2.balls;

public class BallTest {
    public static void main(String[] args){
        var ball = new Ball(1, 2);
        System.out.println(ball);
        ball.move(6, -5);
    }
}
