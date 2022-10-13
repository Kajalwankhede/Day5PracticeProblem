package day5;
import java.util.Scanner;
public class QuotientandRemainder {
void display(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend=sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor =sc.nextInt();
       float quotient= dividend/divisor;
       int remainder= dividend%divisor;
        System.out.println("Remainder = " + remainder);
        System.out.println("Quotient = " + quotient);
    }
    public static void main(String[] args) {
     QuotientandRemainder Q=new QuotientandRemainder();
     Q.display();
    }
    }
