package day5;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        int num, HeadCount = 0, TailCount = 0;
        double Heads, Tails;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of times you want to flip coin:");
        num = sc.nextInt();

        for (int i = 0; i < num; i++){
            double random=Math.random();
            if (random < 0.5)
                HeadCount++;
            else
                TailCount++;
        }
        Heads= HeadCount / (double) num * 100;
        Tails= TailCount / (double) num * 100;
        System.out.println("Percentage of Heads: " +Heads+ "%");
        System.out.println("Percentage of Tails: " +Tails+ "%");
    }
}