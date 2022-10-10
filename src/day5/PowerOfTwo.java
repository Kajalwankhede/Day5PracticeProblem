package day5;

import java.util.Scanner;

public class PowerOfTwo {

        void Display() {
            System.out.println("Enter the number : ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if ((number >= 0) && (number < 31)) {
                System.out.println("2^n = " +  Math.pow(2, number) + "\nTable of power of 2 is " +
                        "less than or equal to " +  Math.pow(2, number) + " : ");
                for (int i = 0; i <= Math.pow(2, number); i++) {
                    System.out.println("2^" + i + " : " +  Math.pow(2, i));
                }
            }
        }
    public static void main(String[] args) {
            PowerOfTwo P=new PowerOfTwo();
            P.Display();
    }
    }

