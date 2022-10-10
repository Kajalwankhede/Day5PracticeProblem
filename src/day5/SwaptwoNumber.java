package day5;

import java.util.Scanner;

public class SwaptwoNumber {
    void swap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Before swap:---");
        System.out.println("Enter First number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number:");
        int num2 = sc.nextInt();
        int temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println("--After swap the result:--\n First Number:" + num1 + "\n Second Number:" + num2);

    }
    public static void main(String[] args) {
      SwaptwoNumber S=new SwaptwoNumber();
      S.swap();
    }
}