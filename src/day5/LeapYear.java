package day5;
import java.util.Scanner;
public class LeapYear {
        void DispayYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if (year >= 1600) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
                System.out.println("Is a Leap year");
            else
                System.out.println("Not a Leap year  ");
        }
    }
    public static void main(String[] args) {
         LeapYear L=new LeapYear();
         L.DispayYear();
    }
    }


