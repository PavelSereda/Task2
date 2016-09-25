package com.epam.task2_1;

public class Backet {

    public static void main(String[] args) {
        try {
            BallsCreator bc = new BallsCreator();
            bc.addBalls();
            System.out.println("Count of blue Balls: " + bc.getCountBlueBalls());
            System.out.println("Balls weight: " + bc.getWeightBalls());
        } catch (Exception ex) {
            System.out.println("Invalid data");
        }
    }

}
