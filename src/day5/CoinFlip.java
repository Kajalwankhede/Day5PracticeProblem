package day5;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args){

        int head=0,tail=0;
        double RandomCheck = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("The number of times to Flip Coin. : ");
        int n=sc.nextInt();
        int limit=n;
        if(n == n) {
            for (int i = 0; i < n; i++) {
                RandomCheck =  (Math.random() * (1 - 0 + 1) + 0);
                if (RandomCheck < 0.5) {
                    head=head+1;
                } else {
                    tail=tail+1;}
            }
        }
        float percentage_Head=findPercentage(head,limit);
        System.out.println("Percentage of Head = "+percentage_Head+"%");
        float percentage_Tail=findPercentage(tail,limit);
        System.out.println("Percentage of Tail = "+percentage_Tail+"%");
    }
    public static float findPercentage(int side,int n) {
        float percentage=(side*100)/n;
        return percentage;
    }

}
