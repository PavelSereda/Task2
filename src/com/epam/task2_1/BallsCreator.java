package com.epam.task2_1;


import java.util.ArrayList;

public class BallsCreator {
    int counterWeight = 0;
    int counterColor = 0;
    Ball b1 = new Ball(2, "Blue");
    Ball b2 = new Ball(3, "Red");
    Ball b3 = new Ball(4, "Blue");
    Ball b4 = new Ball(2, "White");
    Ball b5 = new Ball(2, "Green");
    ArrayList<Ball> ballsList = new ArrayList<>();

    public void addBalls() {
        ballsList.add(b1);
        ballsList.add(b2);
        ballsList.add(b3);
        ballsList.add(b4);
        ballsList.add(b5);
    }

    public int getCountBlueBalls() {
        for (Ball i : ballsList) {
            if (i.color.equals("Blue")) {
                counterColor++;
            }
        }
        return counterColor;
    }

    public int getWeightBalls() {
        for (Ball i : ballsList) {
            counterWeight += i.weight;
        }
        return counterWeight;
    }


}
