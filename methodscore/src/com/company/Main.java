package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Chaitanya", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Chaitanya", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Chaitanya", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Chaitanya", position);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+position+" on the high score table");
    }

        public static int calculateHighScorePosition(int score){
        return score>=1000? 1: (score>=500)?2:(score>=100)?3:4;
    }
}