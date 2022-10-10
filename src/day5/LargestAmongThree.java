package day5;
import java.util.Scanner;

public class LargestAmongThree {
    void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third Number : ");
        int num3 = sc.nextInt();
        if ((num1 > num2) && (num1 > num3))
            System.out.println("Fist is Largest number = " + num1);
        else if ((num2 > num1) && (num2 > num3))
            System.out.println("Second is Largest number = " + num2);
        else
            System.out.println("Third is Largest number = " + num3);
    }
    public static void main(String[] args)
    {
        LargestAmongThree L=new LargestAmongThree();
        L.display();
    }
}
