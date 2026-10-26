package com.pluralsight;

public class Test {
    public static void main(String[] args) {
        int [] scores = {50, 60, 70, 40, 90, 80, 75, 95, 55, 88,};

        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {

            if (scores[i] > highest ) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }

        }
        System.out.println("The highest score is: " + highest);
        System.out.println("The lowest score is: " + lowest);


    }


}
