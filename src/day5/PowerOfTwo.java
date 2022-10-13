package day5;
import java.util.Scanner;
public class PowerOfTwo {
    public static void GetPowerofTwo(int num) {
        int a = 1, b = (int) Math.pow(2, num);
        if (num >= 0 && num < 31) {
            while (a < b) {
                a = a * 2;
                System.out.println(a);
            }
        } else
            System.out.println("Invalid Number: ");
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println("\n The power table of 2 : ");
        GetPowerofTwo(num);
    }
}