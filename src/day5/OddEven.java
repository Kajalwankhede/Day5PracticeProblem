package day5;
import java.util.Scanner;
public class OddEven {
    void display() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = reader.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
    public static void main(String[] args) {
        OddEven E = new OddEven();
        E.display();
    }
}
