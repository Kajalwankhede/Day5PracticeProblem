package day5;
import java.util.Scanner;
public class Factors {
    void Display()
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }
        if (num > 2) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Factors F=new Factors();
        F.Display();
    }
}
