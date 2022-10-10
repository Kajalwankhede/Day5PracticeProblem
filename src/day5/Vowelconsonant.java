package day5;
import java.util.Scanner;
public class Vowelconsonant {
    int Checkalphabate() {
        System.out.println("Enter the alphabet : ");
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        switch (alphabet) {
            case 'a':
                System.out.println("alphabet = a is, a vowel");
                break;
            case 'e':
                System.out.println("alphabet = e is, a vowel");
                break;
            case 'i':
                System.out.println("alphabet = i is, a vowel");
                break;
            case 'o':
                System.out.println("alphabet = o is, a vowel");
                break;
            case 'u':
                System.out.println("alphabet = u is, a vowel");
                break;
            default:
                System.out.println("alphabet = " + alphabet + " is, a consonant");
                break;
        }

        return 0;
    }
        public static void main(String[] args)
        {
         Vowelconsonant V=new Vowelconsonant();
         V.Checkalphabate();

        }
}