package day5;

import java.util.Scanner;

public class HarmonicNumber {
   void display(){
       float sum = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int number=sc.nextInt();
       for (int i = 2; i <= number; i++) {
           float harmonic = (float)1 / i;
           sum = sum + harmonic;
           System.out.println(sum);}
       System.out.print("\nNth Harmonic number : " + sum+"\n");
    }
    public static void main(String[] args) {
       HarmonicNumber H=new HarmonicNumber();
       H.display();
    }
    }
